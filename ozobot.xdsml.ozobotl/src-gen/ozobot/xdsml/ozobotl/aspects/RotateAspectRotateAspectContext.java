package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectProperties;
import ozobot.xdsml.ozobotl.model.Rotate;

@SuppressWarnings("all")
public class RotateAspectRotateAspectContext {
  public final static RotateAspectRotateAspectContext INSTANCE = new RotateAspectRotateAspectContext();
  
  public static RotateAspectRotateAspectProperties getSelf(final Rotate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rotate, RotateAspectRotateAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Rotate, ozobot.xdsml.ozobotl.aspects.RotateAspectRotateAspectProperties>();
  
  public Map<Rotate, RotateAspectRotateAspectProperties> getMap() {
    return map;
  }
}
