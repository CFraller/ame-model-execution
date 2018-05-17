package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectProperties;
import ozobot.xdsml.ozobotl.model.Light;

@SuppressWarnings("all")
public class LightAspectLightAspectContext {
  public final static LightAspectLightAspectContext INSTANCE = new LightAspectLightAspectContext();
  
  public static LightAspectLightAspectProperties getSelf(final Light _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Light, LightAspectLightAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Light, ozobot.xdsml.ozobotl.aspects.LightAspectLightAspectProperties>();
  
  public Map<Light, LightAspectLightAspectProperties> getMap() {
    return map;
  }
}
