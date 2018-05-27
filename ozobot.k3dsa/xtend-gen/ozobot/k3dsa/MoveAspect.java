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
import ozobot.k3dsa.OzobotAspect;
import ozobot.model.Move;
import ozobot.model.Ozobot;

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
  
  public static int velocity(final Move _self) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_velocity(_self_, _self);;
    return (int)result;
  }
  
  private static double orientation(final Move _self) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_orientation(_self_, _self);;
    return (double)result;
  }
  
  private static void orientation(final Move _self, final double orientation) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
    _privk3_orientation(_self_, _self,orientation);;
  }
  
  private static void super_executeCommand(final Move _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self);
  }
  
  protected static void _privk3_executeCommand(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    try {
      final MqttClient client = CommandAspect.getMQTTClient(_self);
      int _distance = _self.getDistance();
      String _plus = (("ozobot-move" + " ") + Integer.valueOf(_distance));
      String _plus_1 = (_plus + " ");
      int _velocity = MoveAspect.velocity(_self);
      final String message = (_plus_1 + Integer.valueOf(_velocity));
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      double _orientation = OzobotAspect.orientation(CommandAspect.getOzobot(_self));
      boolean _lessThan = (_orientation < 0);
      if (_lessThan) {
        double _orientation_1 = OzobotAspect.orientation(CommandAspect.getOzobot(_self));
        double _multiply = (_orientation_1 * (-1));
        MoveAspect.orientation(_self, _multiply);
      } else {
        MoveAspect.orientation(_self, OzobotAspect.orientation(CommandAspect.getOzobot(_self)));
      }
      Ozobot _ozobot = CommandAspect.getOzobot(_self);
      double _xposition = OzobotAspect.xposition(CommandAspect.getOzobot(_self));
      int _distance_1 = _self.getDistance();
      double _cos = Math.cos(Math.toRadians(MoveAspect.orientation(_self)));
      double _multiply_1 = (_distance_1 * _cos);
      double _plus_2 = (_xposition + _multiply_1);
      double _multiply_2 = (_plus_2 * 100);
      long _round = Math.round(_multiply_2);
      long _divide = (_round / 100);
      OzobotAspect.xposition(_ozobot, _divide);
      Ozobot _ozobot_1 = CommandAspect.getOzobot(_self);
      double _yposition = OzobotAspect.yposition(CommandAspect.getOzobot(_self));
      int _distance_2 = _self.getDistance();
      double _sin = Math.sin(Math.toRadians(MoveAspect.orientation(_self)));
      double _multiply_3 = (_distance_2 * _sin);
      double _plus_3 = (_yposition + _multiply_3);
      double _multiply_4 = (_plus_3 * 100);
      long _round_1 = Math.round(_multiply_4);
      long _divide_1 = (_round_1 / 100);
      OzobotAspect.yposition(_ozobot_1, _divide_1);
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
  
  protected static int _privk3_velocity(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    String _string = _self.getVelocity().toString();
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
  
  protected static double _privk3_orientation(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOrientation") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (double) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.orientation;
  }
  
  protected static void _privk3_orientation(final MoveAspectMoveAspectProperties _self_, final Move _self, final double orientation) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOrientation")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, orientation);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.orientation = orientation;
    }
  }
}
