package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.BlockAspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.RepeatAspectRepeatAspectProperties;
import ozobot.model.Command;
import ozobot.model.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class RepeatAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Repeat _self, final MqttClient client) {
    final ozobot.k3dsa.RepeatAspectRepeatAspectProperties _self_ = ozobot.k3dsa.RepeatAspectRepeatAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Repeat){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.RepeatAspect._privk3_executeCommand(_self_, (ozobot.model.Repeat)_self,client);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Repeat","executeCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.executeCommand((ozobot.model.Command)_self,client);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  @OverrideAspectMethod
  public static void initialize(final Repeat _self) {
    final ozobot.k3dsa.RepeatAspectRepeatAspectProperties _self_ = ozobot.k3dsa.RepeatAspectRepeatAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Repeat){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.RepeatAspect._privk3_initialize(_self_, (ozobot.model.Repeat)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Repeat","initialize");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.initialize((ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static int runtimeCounter(final Repeat _self) {
    final ozobot.k3dsa.RepeatAspectRepeatAspectProperties _self_ = ozobot.k3dsa.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_runtimeCounter(_self_, _self);;
    return (int)result;
  }
  
  public static void runtimeCounter(final Repeat _self, final int runtimeCounter) {
    final ozobot.k3dsa.RepeatAspectRepeatAspectProperties _self_ = ozobot.k3dsa.RepeatAspectRepeatAspectContext.getSelf(_self);
    _privk3_runtimeCounter(_self_, _self,runtimeCounter);;
  }
  
  private static void super_executeCommand(final Repeat _self, final MqttClient client) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self,client);
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
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_initialize(_self_, _self);
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
