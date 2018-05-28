package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectProperties;
import ozobot.xdsml.ozobotl.model.Color;
import ozobot.xdsml.ozobotl.model.Light;

@Aspect(className = Light.class)
@SuppressWarnings("all")
public class LightAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Light _self) {
	final ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_executeCommand(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Light", "executeCommand");
	} else {
		command.execute();
	}
	;
	;
}
  
  @OverrideAspectMethod
  public static void createMessage(final Light _self) {
	final ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectContext
			.getSelf(_self);
	_privk3_createMessage(_self_, _self);
	;
}
  
  private static void super_executeCommand(final Light _self) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self);
  }
  
  protected static void _privk3_executeCommand(final LightAspectLightAspectProperties _self_, final Light _self) {
    try {
      LightAspect.createMessage(_self);
      final MqttClient client = CommandAspect.getMQTTClient(_self);
      byte[] _bytes = CommandAspect.message(_self).getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus = ("Executed command " + _name);
      String _plus_1 = (_plus + " on topic: ");
      String _pic = CommandAspect.topic(_self);
      String _plus_2 = (_plus_1 + _pic);
      String _plus_3 = (_plus_2 + " with Message: ");
      String _message = CommandAspect.message(_self);
      String _plus_4 = (_plus_3 + _message);
      InputOutput.<String>println(_plus_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static void super_createMessage(final Light _self) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_createMessage(_self_, _self);
  }
  
  protected static void _privk3_createMessage(final LightAspectLightAspectProperties _self_, final Light _self) {
    Color _color = _self.getColor();
    String _plus = (_color + "Light");
    CommandAspect.message(_self, _plus);
  }
}
