package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties;
import ozobot.xdsml.ozobotl.model.Repeat;

@SuppressWarnings("all")
public class RepeatAspectRepeatAspectContext {
  public final static RepeatAspectRepeatAspectContext INSTANCE = new RepeatAspectRepeatAspectContext();
  
  public static RepeatAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, RepeatAspectRepeatAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Repeat, ozobot.xdsml.ozobotl.aspects.RepeatAspectRepeatAspectProperties>();
  
  public Map<Repeat, RepeatAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
