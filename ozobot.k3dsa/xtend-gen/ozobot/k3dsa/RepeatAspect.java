package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.RepeatAspectRepeatAspectProperties;
import ozobot.model.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class RepeatAspect extends CommandAspect {
  public static int loopCounter(final Repeat _self) {
    final ozobot.k3dsa.RepeatAspectRepeatAspectProperties _self_ = ozobot.k3dsa.RepeatAspectRepeatAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_loopCounter(_self_, _self);;
    return (int)result;
  }
  
  public static void loopCounter(final Repeat _self, final int loopCounter) {
    final ozobot.k3dsa.RepeatAspectRepeatAspectProperties _self_ = ozobot.k3dsa.RepeatAspectRepeatAspectContext.getSelf(_self);
    _privk3_loopCounter(_self_, _self,loopCounter);;
  }
  
  protected static int _privk3_loopCounter(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLoopCounter") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.loopCounter;
  }
  
  protected static void _privk3_loopCounter(final RepeatAspectRepeatAspectProperties _self_, final Repeat _self, final int loopCounter) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLoopCounter")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, loopCounter);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.loopCounter = loopCounter;
    }
  }
}
