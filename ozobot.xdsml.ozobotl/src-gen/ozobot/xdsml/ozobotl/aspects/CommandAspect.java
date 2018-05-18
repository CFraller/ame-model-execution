package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties;
import ozobot.xdsml.ozobotl.aspects.NamedElementAspect;
import ozobot.xdsml.ozobotl.aspects.OzobotProgramAspect;
import ozobot.xdsml.ozobotl.model.Block;
import ozobot.xdsml.ozobotl.model.Command;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

@Aspect(className = Command.class)
@SuppressWarnings("all")
public abstract class CommandAspect extends NamedElementAspect {
  @Step
  public static void executeCommand(final Command _self) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	if (_self instanceof ozobot.xdsml.ozobotl.model.Rotate) {
		ozobot.xdsml.ozobotl.aspects.RotateAspect.executeCommand((ozobot.xdsml.ozobotl.model.Rotate) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Move) {
		ozobot.xdsml.ozobotl.aspects.MoveAspect.executeCommand((ozobot.xdsml.ozobotl.model.Move) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Light) {
		ozobot.xdsml.ozobotl.aspects.LightAspect.executeCommand((ozobot.xdsml.ozobotl.model.Light) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Repeat) {
		ozobot.xdsml.ozobotl.aspects.RepeatAspect.executeCommand((ozobot.xdsml.ozobotl.model.Repeat) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Wait) {
		ozobot.xdsml.ozobotl.aspects.WaitAspect.executeCommand((ozobot.xdsml.ozobotl.model.Wait) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Command) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_,
						(ozobot.xdsml.ozobotl.model.Command) _self);
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
  
  public static void initialize(final Command _self) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	if (_self instanceof ozobot.xdsml.ozobotl.model.Rotate) {
		ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
				(ozobot.xdsml.ozobotl.model.Rotate) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Move) {
		ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_, (ozobot.xdsml.ozobotl.model.Move) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Light) {
		ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_, (ozobot.xdsml.ozobotl.model.Light) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Repeat) {
		ozobot.xdsml.ozobotl.aspects.RepeatAspect.initialize((ozobot.xdsml.ozobotl.model.Repeat) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Wait) {
		ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_, (ozobot.xdsml.ozobotl.model.Wait) _self);
	} else if (_self instanceof ozobot.xdsml.ozobotl.model.Command) {
		ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_initialize(_self_,
				(ozobot.xdsml.ozobotl.model.Command) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static MqttClient getMQTTClient(final Command _self) {
	final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getMQTTClient(_self_, _self);
	;
	return (org.eclipse.paho.client.mqttv3.MqttClient) result;
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
  
  protected static void _privk3_executeCommand(final CommandAspectCommandAspectProperties _self_, final Command _self) {
  }
  
  protected static void _privk3_initialize(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    String _name = _self.getName();
    String _plus = ("Command " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
  }
  
  protected static MqttClient _privk3_getMQTTClient(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    EObject _eContainer = _self.eContainer();
    EObject _eContainer_1 = ((Block) _eContainer).eContainer();
    if ((_eContainer_1 instanceof OzobotProgram)) {
      EObject _eContainer_2 = _self.eContainer();
      EObject _eContainer_3 = ((Block) _eContainer_2).eContainer();
      return OzobotProgramAspect.client(((OzobotProgram) _eContainer_3));
    } else {
      EObject _eContainer_4 = _self.eContainer();
      EObject _eContainer_5 = ((Block) _eContainer_4).eContainer();
      return CommandAspect.getMQTTClient(((Command) _eContainer_5));
    }
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
}
