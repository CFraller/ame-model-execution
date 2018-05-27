package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Date;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties;
import ozobot.xdsml.ozobotl.model.Wait;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Wait _self) {
	final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext
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
		manager.executeStep(_self, command, "Wait", "executeCommand");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  @OverrideAspectMethod
  public static void createMessage(final Wait _self) {
	final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_createMessage(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Wait", "createMessage");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static long startTime(final Wait _self) {
    final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_startTime(_self_, _self);;
    return (long)result;
  }
  
  private static void startTime(final Wait _self, final long startTime) {
    final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext.getSelf(_self);
    _privk3_startTime(_self_, _self,startTime);;
  }
  
  private static long elapsedTime(final Wait _self) {
    final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_elapsedTime(_self_, _self);;
    return (long)result;
  }
  
  private static void elapsedTime(final Wait _self, final long elapsedTime) {
    final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext.getSelf(_self);
    _privk3_elapsedTime(_self_, _self,elapsedTime);;
  }
  
  private static void super_executeCommand(final Wait _self) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self);
  }
  
  protected static void _privk3_executeCommand(final WaitAspectWaitAspectProperties _self_, final Wait _self) {
    WaitAspect.startTime(_self, System.currentTimeMillis());
    WaitAspect.elapsedTime(_self, 0L);
    while ((WaitAspect.elapsedTime(_self) < (_self.getTime() * 1000))) {
      long _time = new Date().getTime();
      long _startTime = WaitAspect.startTime(_self);
      long _minus = (_time - _startTime);
      WaitAspect.elapsedTime(_self, _minus);
    }
    String _name = _self.getName();
    String _plus = ("Executed command " + _name);
    InputOutput.<String>println(_plus);
  }
  
  private static void super_createMessage(final Wait _self) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_createMessage(_self_, _self);
  }
  
  protected static void _privk3_createMessage(final WaitAspectWaitAspectProperties _self_, final Wait _self) {
    int _time = _self.getTime();
    String _plus = ("ozobot-wait " + Integer.valueOf(_time));
    CommandAspect.message(_self, _plus);
  }
  
  protected static long _privk3_startTime(final WaitAspectWaitAspectProperties _self_, final Wait _self) {
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
  
  protected static void _privk3_startTime(final WaitAspectWaitAspectProperties _self_, final Wait _self, final long startTime) {
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
  
  protected static long _privk3_elapsedTime(final WaitAspectWaitAspectProperties _self_, final Wait _self) {
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
  
  protected static void _privk3_elapsedTime(final WaitAspectWaitAspectProperties _self_, final Wait _self, final long elapsedTime) {
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
}
