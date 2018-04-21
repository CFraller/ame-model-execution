package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.RepeatAspectRepeatAspectProperties;
import ozobot.model.Repeat;

@SuppressWarnings("all")
public class RepeatAspectRepeatAspectContext {
  public final static RepeatAspectRepeatAspectContext INSTANCE = new RepeatAspectRepeatAspectContext();
  
  public static RepeatAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.RepeatAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, RepeatAspectRepeatAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Repeat, ozobot.k3dsa.RepeatAspectRepeatAspectProperties>();
  
  public Map<Repeat, RepeatAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
