package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Date;
import java.util.Timer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.BlockAspect;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.NamedElementAspect;
import ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.xdsml.ozobotl.model.Command;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

@Aspect(className = OzobotProgram.class)
@SuppressWarnings("all")
public class OzobotProgramAspect extends NamedElementAspect {
  public static void run(final OzobotProgram _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	_privk3_run(_self_, _self);
	;
}
  
  public static void initialize(final OzobotProgram _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self, client);
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
  
  private static long startTime(final OzobotProgram _self) {
    final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_startTime(_self_, _self);;
    return (long)result;
  }
  
  private static void startTime(final OzobotProgram _self, final long startTime) {
    final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    _privk3_startTime(_self_, _self,startTime);;
  }
  
  private static long elapsedTime(final OzobotProgram _self) {
    final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_elapsedTime(_self_, _self);;
    return (long)result;
  }
  
  private static void elapsedTime(final OzobotProgram _self, final long elapsedTime) {
    final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    _privk3_elapsedTime(_self_, _self,elapsedTime);;
  }
  
  public static Command currentCommand(final OzobotProgram _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentCommand(_self_, _self);
	;
	return (ozobot.xdsml.ozobotl.model.Command) result;
}
  
  public static void currentCommand(final OzobotProgram _self, final Command currentCommand) {
	final ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectContext
			.getSelf(_self);
	_privk3_currentCommand(_self_, _self, currentCommand);
	;
}
  
  protected static void _privk3_run(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
      try {
        while ((OzobotProgramAspect.currentCommand(_self) != null)) {
          {
            CommandAspect.executeCommand(OzobotProgramAspect.currentCommand(_self));
            OzobotProgramAspect.currentCommand(_self, OzobotProgramAspect.currentCommand(_self).getOutgoing().getTarget());
            OzobotProgramAspect.startTime(_self, System.currentTimeMillis());
            OzobotProgramAspect.elapsedTime(_self, 0L);
            while ((OzobotProgramAspect.elapsedTime(_self) < 10000)) {
              long _time = new Date().getTime();
              long _startTime = OzobotProgramAspect.startTime(_self);
              long _minus = (_time - _startTime);
              OzobotProgramAspect.elapsedTime(_self, _minus);
            }
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
    BlockAspect.initialize(_self.getBlock());
    OzobotProgramAspect.currentCommand(_self, _self.getBlock().getCommands().get(0));
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
  
  protected static long _privk3_startTime(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
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
  
  protected static void _privk3_startTime(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final long startTime) {
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
  
  protected static long _privk3_elapsedTime(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
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
  
  protected static void _privk3_elapsedTime(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final long elapsedTime) {
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
  
  protected static Command _privk3_currentCommand(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentCommand") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (ozobot.xdsml.ozobotl.model.Command) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentCommand;
  }
  
  protected static void _privk3_currentCommand(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self, final Command currentCommand) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentCommand")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentCommand);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentCommand = currentCommand;
    }
  }
}
