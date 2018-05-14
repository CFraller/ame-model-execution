package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties;
import ozobot.xdsml.ozobotl.aspects.NamedElementAspect;
import ozobot.xdsml.ozobotl.model.Command;

@Aspect(className = Command.class)
@SuppressWarnings("all")
public abstract class CommandAspect extends NamedElementAspect {
  @Step
  public static void executeCommand(final Command _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	if (_self instanceof ozobot.xdsml.ozobotl.model.Move) {
		ozobot.xdsml.ozobotl.aspects.MoveAspect.executeCommand((ozobot.xdsml.ozobotl.model.Move) _self, client);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Wait) {
		ozobot.xdsml.ozobotl.aspects.WaitAspect.executeCommand((ozobot.xdsml.ozobotl.model.Wait) _self, client);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Light) {
		ozobot.xdsml.ozobotl.aspects.LightAspect.executeCommand((ozobot.xdsml.ozobotl.model.Light) _self, client);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Rotate) {
		ozobot.xdsml.ozobotl.aspects.RotateAspect.executeCommand((ozobot.xdsml.ozobotl.model.Rotate) _self, client);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Repeat) {
		ozobot.xdsml.ozobotl.aspects.RepeatAspect.executeCommand((ozobot.xdsml.ozobotl.model.Repeat) _self, client);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Command) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_,
						(ozobot.xdsml.ozobotl.model.Command) _self, client);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Command", "executeCommand");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Step
  public static void initialize(final Command _self) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	if (_self instanceof ozobot.xdsml.ozobotl.model.Move) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
						(ozobot.xdsml.ozobotl.model.Move) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Command", "initialize");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Wait) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
						(ozobot.xdsml.ozobotl.model.Wait) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Command", "initialize");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Light) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
						(ozobot.xdsml.ozobotl.model.Light) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Command", "initialize");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Rotate) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
						(ozobot.xdsml.ozobotl.model.Rotate) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Command", "initialize");
		} else {
			command.execute();
		}
		;
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Repeat) {
		ozobot.xdsml.ozobotl.aspects.RepeatAspect.initialize((ozobot.xdsml.ozobotl.model.Repeat) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Command) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
						(ozobot.xdsml.ozobotl.model.Command) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Command", "initialize");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static String topic(final Command _self) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_topic(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void topic(final Command _self, final String topic) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	_privk3_topic(_self_, _self, topic);
	;
}
  
  public static MqttClient client(final Command _self) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_client(_self_, _self);
	;
	return (org.eclipse.paho.client.mqttv3.MqttClient) result;
}
  
  public static void client(final Command _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	_privk3_client(_self_, _self, client);
	;
}
  
  protected static void _privk3_executeCommand(final CommandAspectCommandAspectProperties _self_, final Command _self, final MqttClient client) {
  }
  
  protected static void _privk3_initialize(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    String _name = _self.getName();
    String _plus = ("Command " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
  }
  
  protected static String _privk3_topic(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTopic") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.topic;
  }
  
  protected static void _privk3_topic(final CommandAspectCommandAspectProperties _self_, final Command _self, final String topic) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTopic")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, topic);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.topic = topic;
    }
  }
  
  protected static MqttClient _privk3_client(final CommandAspectCommandAspectProperties _self_, final Command _self) {
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
  
  protected static void _privk3_client(final CommandAspectCommandAspectProperties _self_, final Command _self, final MqttClient client) {
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
