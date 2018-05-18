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
import static extension ozobot.k3dsa.OzobotAspect.*
import java.util.Timer
import java.util.TimerTask
import java.util.Date
import org.eclipse.emf.common.util.EList

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=OzobotProgram)
class OzobotProgramAspect extends NamedElementAspect {
	public MqttClient client
	public Timer timer
	private long startTime
	private long elapsedTime
 	public Command currentCommand
	
	@Step
    def public void run() {
    	_self.stepInRun()
    	try{
    		while (_self.currentCommand !== null) {
    			_self.currentCommand.executeCommand()
    			_self.currentCommand = _self.currentCommand.outgoing.target
    			_self.startTime = System.currentTimeMillis();
    			_self.elapsedTime = 0L
    			while(_self.elapsedTime < 10000) {
    				_self.elapsedTime = (new Date()).getTime() - _self.startTime
    			}
    		}
    	}catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
		_self.client.disconnect
		_self.client.close
	}
	
	@Step
	def private void stepInRun() {
		//TODO just for testing, remove again
	}
	
	@Step
	def public void initialize(MqttClient client) {
		println("Program " + _self.name + " initialized.")
		_self.client = client
		_self.block.initialize()
		_self.currentCommand = _self.block.commands.get(0)
	}
}

@Aspect(className=Command)
abstract class CommandAspect extends NamedElementAspect {
	public String topic = "Actuator"
	
	@Step
	def public void executeCommand() {
		
	}
	
	@Step	
	def public void initialize() {
		println("Command " + _self.name + " initialized.")
	}
	
	def public MqttClient getMQTTClient() {
		((_self.eContainer() as Block).eContainer() as OzobotProgram).client
	}
}

@Aspect(className=Move)
class MoveAspect extends CommandAspect {

	@Step
	@OverrideAspectMethod
	def public void executeCommand() {
		_self.doExecute();
	}
	
	@Step
	def private void doExecute() {
		// TODO: maybe this is not necessary; try to remove again
		val client = _self.getMQTTClient()
		val message = "ozobot-move"+" "+_self.distance+" "+_self.velocity()
		val tmp = new MqttMessage(message.bytes)
		client.publish(_self.topic, tmp)	
		println("Executed command "+_self.name +" on topic: "+_self.topic +" with Message: "+message)
	}
	
	def int velocity() {
		if(_self.velocity.toString.toString == 'very_slow') {
			return 1;
		}else if(_self.velocity.toString == 'slow') {
			return 2;
		}else if(_self.velocity.toString == 'medium') {
			return 3;
		}else if(_self.velocity.toString == 'fast') {
			return 4;
		}else if(_self.velocity.toString == 'very_fast') {
			return 5;
		}
	}
}

@Aspect(className=Light)
class LightAspect extends CommandAspect {
	
	@Step
	@OverrideAspectMethod
	def public void executeCommand() {
		val client = _self.getMQTTClient()
		val message = _self.color+"Light"
		val tmp = new MqttMessage(message.bytes)
		client.publish(_self.topic, tmp)
		println("Executed command "+_self.name +" on topic: "+_self.topic +" with Message: "+message)	
	}
}


@Aspect(className=Rotate)
class RotateAspect extends CommandAspect {

	@Step
	@OverrideAspectMethod
	def public void executeCommand() {
		val client = _self.getMQTTClient()
		val message = "ozobot-rotate"+" "+_self.direction+" "+_self.velocity()+" "+_self.angle
		val tmp = new MqttMessage(message.bytes)
		client.publish(_self.topic,tmp)	
		println("Executed command "+_self.name +" on topic: "+_self.topic +" with Message: "+message)
	}
	
	def int velocity() {
		if(_self.velocity.toString.toString == 'very_slow') {
			return 1;
		}else if(_self.velocity.toString == 'slow') {
			return 2;
		}else if(_self.velocity.toString == 'medium') {
			return 3;
		}else if(_self.velocity.toString == 'fast') {
			return 4;
		}else if(_self.velocity.toString == 'very_fast') {
			return 5;
		}
	}
}

@Aspect(className=Wait)
class WaitAspect extends CommandAspect {
	long startTime
	long elapsedTime
	
	@Step
	@OverrideAspectMethod
	def public void executeCommand() {
		val client = _self.getMQTTClient()
		_self.startTime = System.currentTimeMillis();
    	_self.elapsedTime = 0L
    	while(_self.elapsedTime < _self.time*1000) {
    		_self.elapsedTime = (new Date()).getTime() - _self.startTime
    	}
		println("Executed command "+_self.name )
	}
}

@Aspect(className=Repeat)
class RepeatAspect extends CommandAspect {
	public int runtimeCounter
	long startTime
	long elapsedTime
	int i
	OzobotProgram program
	
	@Step
	@OverrideAspectMethod
	def public void executeCommand() {
		while(_self.runtimeCounter != 0) {
			_self.i = 0
			while(_self.i < _self.block.commands.length){
				_self.program.currentCommand = _self.block.commands.get(_self.i)
				_self.program.currentCommand.executeCommand()
				_self.startTime = System.currentTimeMillis();
    			_self.elapsedTime = 0L
    			while(_self.elapsedTime < 10000) {
    				_self.elapsedTime = (new Date()).getTime() - _self.startTime
    			}
    			_self.i=_self.i +1
			}
			_self.runtimeCounter = _self.runtimeCounter - 1
			println("Executed command "+_self.name )
		}
	}
	
	@Step
	@OverrideAspectMethod
	def public void initialize() {
		println("Command " + _self.name + " initialized.")
		_self.runtimeCounter = _self.count
		_self.program = _self.eContainer.eContainer as OzobotProgram
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
		_self.programs.get(0).run()
		while(_self.client.connected){
			
		}
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



