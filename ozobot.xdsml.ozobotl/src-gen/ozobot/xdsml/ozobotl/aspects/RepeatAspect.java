package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.BlockAspect;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties;
import ozobot.xdsml.ozobotl.model.Command;
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
  
  private static void super_executeCommand(final Repeat _self, final MqttClient client) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final MqttClient client) {
    while ((RepeatAspect.runtimeCounter(_self) != 0)) {
      {
        final Consumer<Command> _function = (Command c) -> {
          CommandAspect.executeCommand(c, client);
        };
        _self.getBlock().getCommands().forEach(_function);
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
}
