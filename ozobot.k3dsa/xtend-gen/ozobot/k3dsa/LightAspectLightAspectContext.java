package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.LightAspectLightAspectProperties;
import ozobot.model.Light;

@SuppressWarnings("all")
public class LightAspectLightAspectContext {
  public final static LightAspectLightAspectContext INSTANCE = new LightAspectLightAspectContext();
  
  public static LightAspectLightAspectProperties getSelf(final Light _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.LightAspectLightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Light, LightAspectLightAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Light, ozobot.k3dsa.LightAspectLightAspectProperties>();
  
  public Map<Light, LightAspectLightAspectProperties> getMap() {
    return map;
  }
}
