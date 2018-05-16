package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties;
import ozobot.xdsml.ozobotl.model.Ozobot;

@SuppressWarnings("all")
public class OzobotAspectOzobotAspectContext {
  public final static OzobotAspectOzobotAspectContext INSTANCE = new OzobotAspectOzobotAspectContext();
  
  public static OzobotAspectOzobotAspectProperties getSelf(final Ozobot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Ozobot, OzobotAspectOzobotAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Ozobot, ozobot.xdsml.ozobotl.aspects.OzobotAspectOzobotAspectProperties>();
  
  public Map<Ozobot, OzobotAspectOzobotAspectProperties> getMap() {
    return map;
  }
}
