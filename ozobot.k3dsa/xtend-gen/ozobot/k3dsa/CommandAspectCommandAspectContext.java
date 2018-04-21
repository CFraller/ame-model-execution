package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.CommandAspectCommandAspectProperties;
import ozobot.model.Command;

@SuppressWarnings("all")
public class CommandAspectCommandAspectContext {
  public final static CommandAspectCommandAspectContext INSTANCE = new CommandAspectCommandAspectContext();
  
  public static CommandAspectCommandAspectProperties getSelf(final Command _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.CommandAspectCommandAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Command, CommandAspectCommandAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Command, ozobot.k3dsa.CommandAspectCommandAspectProperties>();
  
  public Map<Command, CommandAspectCommandAspectProperties> getMap() {
    return map;
  }
}
