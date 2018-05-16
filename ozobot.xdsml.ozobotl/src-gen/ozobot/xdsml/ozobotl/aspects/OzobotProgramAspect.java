package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Timer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.BlockAspect;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.NamedElementAspect;
import ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

@Aspect(className = OzobotProgram.class)
@SuppressWarnings("all")
public class OzobotProgramAspect extends NamedElementAspect {
  @Step
  public static void run(final OzobotProgram _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_run(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "OzobotProgram", "run");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void initialize(final OzobotProgram _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_initialize(_self_, _self, client);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "OzobotProgram", "initialize");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static MqttClient client(final OzobotProgram _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_client(_self_, _self);
	;
	return (org.eclipse.paho.client.mqttv3.MqttClient) result;
}
  
  public static void client(final OzobotProgram _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	_privk3_client(_self_, _self, client);
	;
}
  
  public static Timer timer(final OzobotProgram _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_timer(_self_, _self);
	;
	return (java.util.Timer) result;
}
  
  public static void timer(final OzobotProgram _self, final Timer timer) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	_privk3_timer(_self_, _self, timer);
	;
}
  
  protected static void _privk3_run(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
      try {
        while ((_self.getCurrent() != null)) {
          {
            CommandAspect.executeCommand(_self.getCurrent(), OzobotProgramAspect.client(_self));
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
      OzobotProgramAspect.client(_self).disconnect();
      OzobotProgramAspect.client(_self).close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_initialize(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final MqttClient client) {
    String _name = _self.getName();
    String _plus = ("Program " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    OzobotProgramAspect.client(_self, client);
    Timer _timer = new Timer();
    OzobotProgramAspect.timer(_self, _timer);
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
  
  protected static Timer _privk3_timer(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTimer") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Timer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.timer;
  }
  
  protected static void _privk3_timer(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final Timer timer) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTimer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, timer);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.timer = timer;
    }
  }
}
