package ozobot.xdsml.ozobotl.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectProperties;
import ozobot.xdsml.ozobotl.model.Direction;
import ozobot.xdsml.ozobotl.model.Rotate;

@Aspect(className = Rotate.class)
@SuppressWarnings("all")
public class RotateAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Rotate _self) {
	final ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectContext
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
		manager.executeStep(_self, command, "Rotate", "executeCommand");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static int velocity(final Rotate _self) {
	final ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_velocity(_self_, _self);
	;
	return (int) result;
}
  
  private static void super_executeCommand(final Rotate _self) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self);
  }
  
  protected static void _privk3_executeCommand(final RotateAspectRotateAspectProperties _self_, final Rotate _self) {
    try {
      final MqttClient client = CommandAspect.getMQTTClient(_self);
      Direction _direction = _self.getDirection();
      String _plus = (("ozobot-rotate" + " ") + _direction);
      String _plus_1 = (_plus + " ");
      int _velocity = RotateAspect.velocity(_self);
      String _plus_2 = (_plus_1 + Integer.valueOf(_velocity));
      String _plus_3 = (_plus_2 + " ");
      float _angle = _self.getAngle();
      final String message = (_plus_3 + Float.valueOf(_angle));
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus_4 = ("Executed command " + _name);
      String _plus_5 = (_plus_4 + " on topic: ");
      String _pic = CommandAspect.topic(_self);
      String _plus_6 = (_plus_5 + _pic);
      String _plus_7 = (_plus_6 + " with Message: ");
      String _plus_8 = (_plus_7 + message);
      InputOutput.<String>println(_plus_8);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static int _privk3_velocity(final RotateAspectRotateAspectProperties _self_, final Rotate _self) {
    String _string = _self.getVelocity().toString().toString();
    boolean _equals = Objects.equal(_string, "very_slow");
    if (_equals) {
      return 1;
    } else {
      String _string_1 = _self.getVelocity().toString();
      boolean _equals_1 = Objects.equal(_string_1, "slow");
      if (_equals_1) {
        return 2;
      } else {
        String _string_2 = _self.getVelocity().toString();
        boolean _equals_2 = Objects.equal(_string_2, "medium");
        if (_equals_2) {
          return 3;
        } else {
          String _string_3 = _self.getVelocity().toString();
          boolean _equals_3 = Objects.equal(_string_3, "fast");
          if (_equals_3) {
            return 4;
          } else {
            String _string_4 = _self.getVelocity().toString();
            boolean _equals_4 = Objects.equal(_string_4, "very_fast");
            if (_equals_4) {
              return 5;
            }
          }
        }
      }
    }
    return 0;
  }
}
