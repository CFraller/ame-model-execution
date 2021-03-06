package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.CommandAspectCommandAspectProperties;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.k3dsa.OzobotProgramAspect;
import ozobot.model.Block;
import ozobot.model.Command;
import ozobot.model.Ozobot;
import ozobot.model.OzobotProgram;

@Aspect(className = Command.class)
@SuppressWarnings("all")
public abstract class CommandAspect extends NamedElementAspect {
  @Step
  public static void executeCommand(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Light){
    					ozobot.k3dsa.LightAspect.executeCommand((ozobot.model.Light)_self);
    } else  if (_self instanceof ozobot.model.Rotate){
    					ozobot.k3dsa.RotateAspect.executeCommand((ozobot.model.Rotate)_self);
    } else  if (_self instanceof ozobot.model.Wait){
    					ozobot.k3dsa.WaitAspect.executeCommand((ozobot.model.Wait)_self);
    } else  if (_self instanceof ozobot.model.Repeat){
    					ozobot.k3dsa.RepeatAspect.executeCommand((ozobot.model.Repeat)_self);
    } else  if (_self instanceof ozobot.model.Move){
    					ozobot.k3dsa.MoveAspect.executeCommand((ozobot.model.Move)_self);
    } else  if (_self instanceof ozobot.model.Command){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, (ozobot.model.Command)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Command","executeCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void initialize(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Repeat){
    					ozobot.k3dsa.RepeatAspect.initialize((ozobot.model.Repeat)_self);
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect._privk3_initialize(_self_, (ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static MqttClient getMQTTClient(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getMQTTClient(_self_, _self);;
    return (org.eclipse.paho.client.mqttv3.MqttClient)result;
  }
  
  public static Ozobot getOzobot(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getOzobot(_self_, _self);;
    return (ozobot.model.Ozobot)result;
  }
  
  public static void createMessage(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Light){
    					ozobot.k3dsa.LightAspect.createMessage((ozobot.model.Light)_self);
    } else  if (_self instanceof ozobot.model.Rotate){
    					ozobot.k3dsa.RotateAspect.createMessage((ozobot.model.Rotate)_self);
    } else  if (_self instanceof ozobot.model.Wait){
    					ozobot.k3dsa.WaitAspect.createMessage((ozobot.model.Wait)_self);
    } else  if (_self instanceof ozobot.model.Repeat){
    					ozobot.k3dsa.RepeatAspect.createMessage((ozobot.model.Repeat)_self);
    } else  if (_self instanceof ozobot.model.Move){
    					ozobot.k3dsa.MoveAspect.createMessage((ozobot.model.Move)_self);
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect._privk3_createMessage(_self_, (ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static String topic(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_topic(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void topic(final Command _self, final String topic) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
    _privk3_topic(_self_, _self,topic);;
  }
  
  public static String message(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_message(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void message(final Command _self, final String message) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
    _privk3_message(_self_, _self,message);;
  }
  
  protected static void _privk3_executeCommand(final CommandAspectCommandAspectProperties _self_, final Command _self) {
  }
  
  protected static void _privk3_initialize(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    CommandAspect.createMessage(_self);
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
  
  protected static Ozobot _privk3_getOzobot(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    EObject _eContainer = _self.eContainer();
    EObject _eContainer_1 = ((Block) _eContainer).eContainer();
    if ((_eContainer_1 instanceof OzobotProgram)) {
      EObject _eContainer_2 = _self.eContainer();
      EObject _eContainer_3 = ((Block) _eContainer_2).eContainer();
      EObject _eContainer_4 = ((OzobotProgram) _eContainer_3).eContainer();
      return ((Ozobot) _eContainer_4);
    } else {
      EObject _eContainer_5 = _self.eContainer();
      EObject _eContainer_6 = ((Block) _eContainer_5).eContainer();
      return CommandAspect.getOzobot(((Command) _eContainer_6));
    }
  }
  
  protected static void _privk3_createMessage(final CommandAspectCommandAspectProperties _self_, final Command _self) {
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
  
  protected static String _privk3_message(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMessage") &&
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
    return _self_.message;
  }
  
  protected static void _privk3_message(final CommandAspectCommandAspectProperties _self_, final Command _self, final String message) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMessage")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, message);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.message = message;
    }
  }
}
