package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.BlockAspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.model.OzobotProgram;

@Aspect(className = OzobotProgram.class)
@SuppressWarnings("all")
public class OzobotProgramAspect extends NamedElementAspect {
  @Main
  public static void main(final OzobotProgram _self) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  @Step
  public static void initialize(final OzobotProgram _self, final MqttClient client) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self,client);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"OzobotProgram","initialize");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static MqttClient client(final OzobotProgram _self) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_client(_self_, _self);;
    return (org.eclipse.paho.client.mqttv3.MqttClient)result;
  }
  
  public static void client(final OzobotProgram _self, final MqttClient client) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    _privk3_client(_self_, _self,client);;
  }
  
  protected static void _privk3_main(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
      while ((_self.getCurrent() != null)) {
        {
          CommandAspect.sendCommand(_self.getCurrent(), OzobotProgramAspect.client(_self));
          _self.setCurrent(_self.getCurrent().getOutgoing().getTarget());
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static void _privk3_initialize(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final MqttClient client) {
    String _name = _self.getName();
    String _plus = ("Program " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    OzobotProgramAspect.client(_self, client);
    BlockAspect.initialize(_self.getBlock());
    _self.setCurrent(_self.getBlock().getCommands().get(0));
  }
  
  protected static MqttClient _privk3_client(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getClient") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.paho.client.mqttv3.MqttClient) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.client;
  }
  
  protected static void _privk3_client(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final MqttClient client) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setClient")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, client);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.client = client;
    }
  }
}
