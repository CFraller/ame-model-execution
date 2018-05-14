package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.MoveAspectMoveAspectProperties;
import ozobot.xdsml.ozobotl.model.Move;
import ozobot.xdsml.ozobotl.model.Velocity;

@Aspect(className = Move.class)
@SuppressWarnings("all")
public class MoveAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Move _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.MoveAspectMoveAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.MoveAspectMoveAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_executeCommand(_self_, _self, client);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Move", "executeCommand");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_executeCommand(final Move _self, final MqttClient client) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final MoveAspectMoveAspectProperties _self_, final Move _self, final MqttClient client) {
    try {
      int _distance = _self.getDistance();
      String _plus = (("ozobot-move" + " ") + Integer.valueOf(_distance));
      String _plus_1 = (_plus + " ");
      Velocity _velocity = _self.getVelocity();
      final String message = (_plus_1 + _velocity);
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus_2 = ("Executed command " + _name);
      InputOutput.<String>println(_plus_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
