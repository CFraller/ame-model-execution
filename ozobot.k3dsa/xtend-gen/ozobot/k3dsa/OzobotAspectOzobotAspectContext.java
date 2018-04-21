package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.OzobotAspectOzobotAspectProperties;
import ozobot.model.Ozobot;

@SuppressWarnings("all")
public class OzobotAspectOzobotAspectContext {
  public final static OzobotAspectOzobotAspectContext INSTANCE = new OzobotAspectOzobotAspectContext();
  
  public static OzobotAspectOzobotAspectProperties getSelf(final Ozobot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.OzobotAspectOzobotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Ozobot, OzobotAspectOzobotAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Ozobot, ozobot.k3dsa.OzobotAspectOzobotAspectProperties>();
  
  public Map<Ozobot, OzobotAspectOzobotAspectProperties> getMap() {
    return map;
  }
}
