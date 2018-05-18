package ozobot.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.MoveAspectMoveAspectProperties;
import ozobot.model.Move;

@Aspect(className = Move.class)
@SuppressWarnings("all")
public class MoveAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Move _self) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Move){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.MoveAspect._privk3_executeCommand(_self_, (ozobot.model.Move)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Move","executeCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.executeCommand((ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  private static void doExecute(final Move _self) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_doExecute(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Move","doExecute");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static int velocity(final Move _self) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_velocity(_self_, _self);;
    return (int)result;
  }
  
  private static void super_executeCommand(final Move _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self);
  }
  
  protected static void _privk3_executeCommand(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    MoveAspect.doExecute(_self);
  }
  
  protected static void _privk3_doExecute(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    try {
      final MqttClient client = CommandAspect.getMQTTClient(_self);
      int _distance = _self.getDistance();
      String _plus = (("ozobot-move" + " ") + Integer.valueOf(_distance));
      String _plus_1 = (_plus + " ");
      int _velocity = MoveAspect.velocity(_self);
      final String message = (_plus_1 + Integer.valueOf(_velocity));
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus_2 = ("Executed command " + _name);
      String _plus_3 = (_plus_2 + " on topic: ");
      String _pic = CommandAspect.topic(_self);
      String _plus_4 = (_plus_3 + _pic);
      String _plus_5 = (_plus_4 + " with Message: ");
      String _plus_6 = (_plus_5 + message);
      InputOutput.<String>println(_plus_6);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static int _privk3_velocity(final MoveAspectMoveAspectProperties _self_, final Move _self) {
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
