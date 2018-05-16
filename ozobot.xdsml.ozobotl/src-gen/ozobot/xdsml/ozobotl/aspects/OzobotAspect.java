package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.function.Consumer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.NamedElementAspect;
import ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties;
import ozobot.xdsml.ozobotl.aspects.OzobotProgramAspect;
import ozobot.xdsml.ozobotl.model.Ozobot;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

@Aspect(className = Ozobot.class)
@SuppressWarnings("all")
public class OzobotAspect extends NamedElementAspect {
  @InitializeModel
  public static void initialize(final Ozobot _self, final String[] args) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self, args);
	;
}
  
  @Main
  public static void main(final Ozobot _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  public static float xposition(final Ozobot _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_xposition(_self_, _self);
	;
	return (float) result;
}
  
  public static void xposition(final Ozobot _self, final float xposition) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	_privk3_xposition(_self_, _self, xposition);
	;
}
  
  public static float yposition(final Ozobot _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_yposition(_self_, _self);
	;
	return (float) result;
}
  
  public static void yposition(final Ozobot _self, final float yposition) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	_privk3_yposition(_self_, _self, yposition);
	;
}
  
  public static float orientation(final Ozobot _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_orientation(_self_, _self);
	;
	return (float) result;
}
  
  public static void orientation(final Ozobot _self, final float orientation) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	_privk3_orientation(_self_, _self, orientation);
	;
}
  
  public static MqttClient client(final Ozobot _self) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_client(_self_, _self);
	;
	return (org.eclipse.paho.client.mqttv3.MqttClient) result;
}
  
  public static void client(final Ozobot _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectContext
			.getSelf(_self);
	_privk3_client(_self_, _self, client);
	;
}
  
  protected static void _privk3_initialize(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self, final String[] args) {
    try {
      MqttClient _mqttClient = new MqttClient("tcp://192.168.99.100:1883", "GemocClient");
      OzobotAspect.client(_self, _mqttClient);
      final MqttConnectOptions connOpts = new MqttConnectOptions();
      connOpts.setCleanSession(true);
      OzobotAspect.client(_self).connect(connOpts);
      InputOutput.<String>println("Connected");
      String _name = _self.getName();
      String _plus = ("Ozobot " + _name);
      String _plus_1 = (_plus + " initialized.");
      InputOutput.<String>println(_plus_1);
      final Consumer<OzobotProgram> _function = (OzobotProgram p) -> {
        OzobotProgramAspect.initialize(p, OzobotAspect.client(_self));
      };
      _self.getPrograms().forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_main(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self) {
    final Consumer<OzobotProgram> _function = (OzobotProgram p) -> {
      OzobotProgramAspect.run(p);
    };
    _self.getPrograms().forEach(_function);
  }
  
  protected static float _privk3_xposition(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getXposition") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.xposition;
  }
  
  protected static void _privk3_xposition(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self, final float xposition) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setXposition")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, xposition);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.xposition = xposition;
    }
  }
  
  protected static float _privk3_yposition(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getYposition") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.yposition;
  }
  
  protected static void _privk3_yposition(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self, final float yposition) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setYposition")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, yposition);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.yposition = yposition;
    }
  }
  
  protected static float _privk3_orientation(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOrientation") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.orientation;
  }
  
  protected static void _privk3_orientation(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self, final float orientation) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOrientation")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, orientation);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.orientation = orientation;
    }
  }
  
  protected static MqttClient _privk3_client(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self) {
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
  
  protected static void _privk3_client(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self, final MqttClient client) {
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
