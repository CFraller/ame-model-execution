package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.k3dsa.OzobotAspectOzobotAspectProperties;
import ozobot.k3dsa.OzobotProgramAspect;
import ozobot.model.Ozobot;
import ozobot.model.OzobotProgram;

@Aspect(className = Ozobot.class)
@SuppressWarnings("all")
public class OzobotAspect extends NamedElementAspect {
  public static void initialize(final Ozobot _self) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);;
  }
  
  public static float xposition(final Ozobot _self) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_xposition(_self_, _self);;
    return (float)result;
  }
  
  public static void xposition(final Ozobot _self, final float xposition) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    _privk3_xposition(_self_, _self,xposition);;
  }
  
  public static float yposition(final Ozobot _self) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_yposition(_self_, _self);;
    return (float)result;
  }
  
  public static void yposition(final Ozobot _self, final float yposition) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    _privk3_yposition(_self_, _self,yposition);;
  }
  
  public static float orientation(final Ozobot _self) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_orientation(_self_, _self);;
    return (float)result;
  }
  
  public static void orientation(final Ozobot _self, final float orientation) {
    final ozobot.k3dsa.OzobotAspectOzobotAspectProperties _self_ = ozobot.k3dsa.OzobotAspectOzobotAspectContext.getSelf(_self);
    _privk3_orientation(_self_, _self,orientation);;
  }
  
  protected static void _privk3_initialize(final OzobotAspectOzobotAspectProperties _self_, final Ozobot _self) {
    String _name = _self.getName();
    String _plus = ("Ozobot " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    final Consumer<OzobotProgram> _function = (OzobotProgram p) -> {
      OzobotProgramAspect.initialize(p);
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
}
