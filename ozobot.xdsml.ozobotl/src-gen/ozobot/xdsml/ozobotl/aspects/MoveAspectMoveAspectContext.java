package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.MoveAspectMoveAspectProperties;
import ozobot.xdsml.ozobotl.model.Move;

@SuppressWarnings("all")
public class MoveAspectMoveAspectContext {
  public final static MoveAspectMoveAspectContext INSTANCE = new MoveAspectMoveAspectContext();
  
  public static MoveAspectMoveAspectProperties getSelf(final Move _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.MoveAspectMoveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Move, MoveAspectMoveAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Move, ozobot.xdsml.ozobotl.aspects.MoveAspectMoveAspectProperties>();
  
  public Map<Move, MoveAspectMoveAspectProperties> getMap() {
    return map;
  }
}
