package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.NamedElementAspectNamedElementAspectProperties;
import ozobot.xdsml.ozobotl.model.NamedElement;

@SuppressWarnings("all")
public class NamedElementAspectNamedElementAspectContext {
  public final static NamedElementAspectNamedElementAspectContext INSTANCE = new NamedElementAspectNamedElementAspectContext();
  
  public static NamedElementAspectNamedElementAspectProperties getSelf(final NamedElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.NamedElementAspectNamedElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NamedElement, NamedElementAspectNamedElementAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.NamedElement, ozobot.xdsml.ozobotl.aspects.NamedElementAspectNamedElementAspectProperties>();
  
  public Map<NamedElement, NamedElementAspectNamedElementAspectProperties> getMap() {
    return map;
  }
}
