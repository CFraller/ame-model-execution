package ozobot.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ozobot.model.NamedElement
import ozobot.model.OzobotProgram
import ozobot.model.Command
import ozobot.model.Move
import ozobot.model.Light
import ozobot.model.Rotate
import ozobot.model.Wait
import ozobot.model.Repeat
import ozobot.model.Ozobot
import ozobot.model.Block
import ozobot.model.Transition
import org.eclipse.paho.client.mqttv3.*


import static extension ozobot.k3dsa.NamedElementAspect.*
import static extension ozobot.k3dsa.OzobotProgramAspect.*
import static extension ozobot.k3dsa.CommandAspect.*
import static extension ozobot.k3dsa.MoveAspect.*
import static extension ozobot.k3dsa.LightAspect.*
import static extension ozobot.k3dsa.RotateAspect.*
import static extension ozobot.k3dsa.WaitAspect.*
import static extension ozobot.k3dsa.RepeatAspect.*
import static extension ozobot.k3dsa.OzobotAspect.*
import static extension ozobot.k3dsa.BlockAspect.*
import static extension ozobot.k3dsa.TransitionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=OzobotProgram)
class OzobotProgramAspect extends NamedElementAspect {
	
	@Main
    def public void main() {
    	try{
    		while (_self.current !== null) {
    			_self.current.sendCommand()
    			_self.current = _self.current.outgoing.target
    		}
    	}catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
	}
	
	@Step
	def public void initialize() {
		println("Program " + _self.name + " initialized.")
		_self.block.initialize()
		_self.current = _self.block.commands.get(0)
	}

}

@Aspect(className=Command)
abstract class CommandAspect extends NamedElementAspect {
	public String topic = "Actuator"
	
	@Step
	def public void sendCommand() {
		
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
	def public void sendCommand() {
		client.publish(_self.topic,"ozobot-move"+" "+_self.distance+" "+_self.velocity)	
	}

}

@Aspect(className=Light)
class LightAspect extends CommandAspect {
	
	@Step
	@OverrideAspectMethod
	def public void sendCommand() {
		client.publish(_self.topic,_self.color+"Light")	
	}
}

@Aspect(className=Rotate)
class RotateAspect extends CommandAspect {

	@Step
	@OverrideAspectMethod
	def public void sendCommand() {
		client.publish(_self.topic,"ozobot-rotate"+" "+_self.direction+" "+_self.velocity+" "+_self.angle)	
	}
}

@Aspect(className=Wait)
class WaitAspect extends CommandAspect {

}

@Aspect(className=Repeat)
class RepeatAspect extends CommandAspect {
	public int runtimeCounter
	
	@Step
	def public void repeat() {
		_self.runtimeCounter = _self.runtimeCounter - 1
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
	
	@Step
	@InitializeModel
	def public void initialize(){
		val client = new MqttClient("tcp://192.168.99.100:1883","GemocClient")
		val connOpts = new MqttConnectOptions()
		connOpts.setCleanSession(true)
		client.connect(connOpts)
		println("Connected")
		println("Ozobot " + _self.name + " initialized.")
		_self.programs.forEach [p | p.initialize]
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



