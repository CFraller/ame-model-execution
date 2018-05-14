package ozobot.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.MqttMessage
import ozobot.model.Block
import ozobot.model.Command
import ozobot.model.Light
import ozobot.model.Move
import ozobot.model.NamedElement
import ozobot.model.Ozobot
import ozobot.model.OzobotProgram
import ozobot.model.Repeat
import ozobot.model.Rotate
import ozobot.model.Transition
import ozobot.model.Wait

import static extension ozobot.k3dsa.BlockAspect.*
import static extension ozobot.k3dsa.CommandAspect.*
import static extension ozobot.k3dsa.OzobotProgramAspect.*

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=OzobotProgram)
class OzobotProgramAspect extends NamedElementAspect {
	public MqttClient client
	
	@Step
    def public void run() {
    	try{
    		while (_self.current !== null) {
    			_self.current.executeCommand(_self.client)
    			_self.current = _self.current.outgoing.target
    		}
    	}catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
		
		_self.client.disconnect
		_self.client.close
	}
	
	@Step
	def public void initialize(MqttClient client) {
		println("Program " + _self.name + " initialized.")
		_self.client = client
		_self.block.initialize()
		_self.current = _self.block.commands.get(0)
	}
}

@Aspect(className=Command)
abstract class CommandAspect extends NamedElementAspect {
	public String topic = "Actuator"
	public MqttClient client
	
	@Step
	def public void executeCommand(MqttClient client) {
		
	}
	
	@Step	
	def public void initialize() {
		println("Command " + _self.name + " initialized.")
	}
}

@Aspect(className=Move)
class MoveAspect extends CommandAspect {

	@Step
	@OverrideAspectMethod
	def public void executeCommand(MqttClient client) {
		val message = "ozobot-move"+" "+_self.distance+" "+_self.velocity
		val tmp = new MqttMessage(message.bytes)
		client.publish(_self.topic, tmp)	
		println("Executed command "+_self.name)
	}
}

@Aspect(className=Light)
class LightAspect extends CommandAspect {
	
	@Step
	@OverrideAspectMethod
	def public void executeCommand(MqttClient client) {
		val message = _self.color+"Light"
		val tmp = new MqttMessage(message.bytes)
		client.publish(_self.topic, tmp)
		println("Executed command "+_self.name)	
	}
}

@Aspect(className=Rotate)
class RotateAspect extends CommandAspect {

	@Step
	@OverrideAspectMethod
	def public void executeCommand(MqttClient client) {
		val message = "ozobot-rotate"+" "+_self.direction+" "+_self.velocity+" "+_self.angle
		val tmp = new MqttMessage(message.bytes)
		client.publish(_self.topic,tmp)	
		println("Executed command "+_self.name)
	}
}

@Aspect(className=Wait)
class WaitAspect extends CommandAspect {
	
	@Step
	@OverrideAspectMethod
	def public void executeCommand(MqttClient client) {
		println("Executed command "+_self.name)
	}
}

@Aspect(className=Repeat)
class RepeatAspect extends CommandAspect {
	public int runtimeCounter
	
	@Step
	@OverrideAspectMethod
	def public void executeCommand(MqttClient client) {
		while(_self.runtimeCounter != 0) {
			_self.block.commands.forEach[c | c.executeCommand(client)]
			_self.runtimeCounter = _self.runtimeCounter - 1
			println("Executed command "+_self.name)
		}
	}
	
	@Step
	@OverrideAspectMethod
	def public void initialize() {
		println("Command " + _self.name + " initialized.")
		_self.runtimeCounter = _self.count
		_self.block.initialize()
	}
}

@Aspect(className=Ozobot)
class OzobotAspect extends NamedElementAspect {
	public float xposition
	public float yposition
	public float orientation 
	public MqttClient client


	
	@InitializeModel
	def public void initialize(String[] args){
		_self.client = new MqttClient("tcp://192.168.99.100:1883","GemocClient")
		val connOpts = new MqttConnectOptions()
		connOpts.setCleanSession(true)
		_self.client.connect(connOpts)
		println("Connected")
		println("Ozobot " + _self.name + " initialized.")
		_self.programs.forEach [p | p.initialize(_self.client)]
	}
	
	@Main
	def public void main(){
		_self.programs.forEach [p | p.run]
	}
}

@Aspect(className=Block)
class BlockAspect extends NamedElementAspect {

	@Step
	def public void initialize() {
		println("Block " + _self.name + " initialized.")
		_self.commands.forEach [c | c.initialize]
	}
}

@Aspect(className=Transition)
class TransitionAspect extends NamedElementAspect {

}



