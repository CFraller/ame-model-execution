package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties;
import ozobot.xdsml.ozobotl.model.Command;

@SuppressWarnings("all")
public class CommandAspectCommandAspectContext {
  public final static CommandAspectCommandAspectContext INSTANCE = new CommandAspectCommandAspectContext();
  
  public static CommandAspectCommandAspectProperties getSelf(final Command _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Command, CommandAspectCommandAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Command, ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties>();
  
  public Map<Command, CommandAspectCommandAspectProperties> getMap() {
    return map;
  }
}
