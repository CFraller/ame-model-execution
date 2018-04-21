package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.RotateAspectRotateAspectProperties;
import ozobot.model.Rotate;

@SuppressWarnings("all")
public class RotateAspectRotateAspectContext {
  public final static RotateAspectRotateAspectContext INSTANCE = new RotateAspectRotateAspectContext();
  
  public static RotateAspectRotateAspectProperties getSelf(final Rotate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.RotateAspectRotateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rotate, RotateAspectRotateAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Rotate, ozobot.k3dsa.RotateAspectRotateAspectProperties>();
  
  public Map<Rotate, RotateAspectRotateAspectProperties> getMap() {
    return map;
  }
}
