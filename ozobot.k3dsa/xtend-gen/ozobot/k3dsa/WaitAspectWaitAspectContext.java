package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.WaitAspectWaitAspectProperties;
import ozobot.model.Wait;

@SuppressWarnings("all")
public class WaitAspectWaitAspectContext {
  public final static WaitAspectWaitAspectContext INSTANCE = new WaitAspectWaitAspectContext();
  
  public static WaitAspectWaitAspectProperties getSelf(final Wait _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.WaitAspectWaitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Wait, WaitAspectWaitAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Wait, ozobot.k3dsa.WaitAspectWaitAspectProperties>();
  
  public Map<Wait, WaitAspectWaitAspectProperties> getMap() {
    return map;
  }
}
