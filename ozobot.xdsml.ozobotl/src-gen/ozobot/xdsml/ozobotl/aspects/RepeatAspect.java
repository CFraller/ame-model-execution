package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Date;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.BlockAspect;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties;
import ozobot.xdsml.ozobotl.model.OzobotProgram;
import ozobot.xdsml.ozobotl.model.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class RepeatAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Repeat _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext
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
		manager.executeStep(_self, command, "Repeat", "executeCommand");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  @OverrideAspectMethod
  public static void initialize(final Repeat _self) {
	final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_initialize(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Repeat", "initialize");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static int runtimeCounter(final Repeat _self) {
	final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_runtimeCounter(_self_, _self);
	;
	return (int) result;
}
  
  public static void runtimeCounter(final Repeat _self, final int runtimeCounter) {
	final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext
			.getSelf(_self);
	_privk3_runtimeCounter(_self_, _self, runtimeCounter);
	;
}
  
  private static long startTime(final Repeat _self) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_startTime(_self_, _self);;
    return (long)result;
  }
  
  private static void startTime(final Repeat _self, final long startTime) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    _privk3_startTime(_self_, _self,startTime);;
  }
  
  private static long elapsedTime(final Repeat _self) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_elapsedTime(_self_, _self);;
    return (long)result;
  }
  
  private static void elapsedTime(final Repeat _self, final long elapsedTime) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    _privk3_elapsedTime(_self_, _self,elapsedTime);;
  }
  
  private static int i(final Repeat _self) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_i(_self_, _self);;
    return (int)result;
  }
  
  private static void i(final Repeat _self, final int i) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    _privk3_i(_self_, _self,i);;
  }
  
  private static OzobotProgram program(final Repeat _self) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_program(_self_, _self);;
    return (ozobot.xdsml.ozobotl.model.OzobotProgram)result;
  }
  
  private static void program(final Repeat _self, final OzobotProgram program) {
    final ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectContext.getSelf(_self);
    _privk3_program(_self_, _self,program);;
  }
  
  private static void super_executeCommand(final Repeat _self, final MqttClient client) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final MqttClient client) {
    while ((RepeatAspect.runtimeCounter(_self) != 0)) {
      {
        RepeatAspect.i(_self, 0);
        while ((RepeatAspect.i(_self) < ((Object[])Conversions.unwrapArray(_self.getBlock().getCommands(), Object.class)).length)) {
          {
            OzobotProgram _program = RepeatAspect.program(_self);
            _program.setCurrent(_self.getBlock().getCommands().get(RepeatAspect.i(_self)));
            CommandAspect.executeCommand(RepeatAspect.program(_self).getCurrent(), client);
            RepeatAspect.startTime(_self, System.currentTimeMillis());
            RepeatAspect.elapsedTime(_self, 0L);
            while ((RepeatAspect.elapsedTime(_self) < 10000)) {
              long _time = new Date().getTime();
              long _startTime = RepeatAspect.startTime(_self);
              long _minus = (_time - _startTime);
              RepeatAspect.elapsedTime(_self, _minus);
            }
            int _i = RepeatAspect.i(_self);
            int _plus = (_i + 1);
            RepeatAspect.i(_self, _plus);
          }
        }
        int _runtimeCounter = RepeatAspect.runtimeCounter(_self);
        int _minus = (_runtimeCounter - 1);
        RepeatAspect.runtimeCounter(_self, _minus);
        String _name = _self.getName();
        String _plus = ("Executed command " + _name);
        InputOutput.<String>println(_plus);
      }
    }
  }
  
  private static void super_initialize(final Repeat _self) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_, _self);
  }
  
  protected static void _privk3_initialize(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    String _name = _self.getName();
    String _plus = ("Command " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    RepeatAspect.runtimeCounter(_self, _self.getCount());
    EObject _eContainer = _self.eContainer().eContainer();
    RepeatAspect.program(_self, ((OzobotProgram) _eContainer));
    BlockAspect.initialize(_self.getBlock());
  }
  
  protected static int _privk3_runtimeCounter(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRuntimeCounter") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.runtimeCounter;
  }
  
  protected static void _privk3_runtimeCounter(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final int runtimeCounter) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRuntimeCounter")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, runtimeCounter);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.runtimeCounter = runtimeCounter;
    }
  }
  
  protected static long _privk3_startTime(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStartTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.startTime;
  }
  
  protected static void _privk3_startTime(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final long startTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStartTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, startTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.startTime = startTime;
    }
  }
  
  protected static long _privk3_elapsedTime(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getElapsedTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.elapsedTime;
  }
  
  protected static void _privk3_elapsedTime(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final long elapsedTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setElapsedTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, elapsedTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.elapsedTime = elapsedTime;
    }
  }
  
  protected static int _privk3_i(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getI") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.i;
  }
  
  protected static void _privk3_i(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final int i) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setI")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, i);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.i = i;
    }
  }
  
  protected static OzobotProgram _privk3_program(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProgram") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (ozobot.xdsml.ozobotl.model.OzobotProgram) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.program;
  }
  
  protected static void _privk3_program(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final OzobotProgram program) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProgram")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, program);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.program = program;
    }
  }
}
