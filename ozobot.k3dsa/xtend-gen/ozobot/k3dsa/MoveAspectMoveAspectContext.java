package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.MoveAspectMoveAspectProperties;
import ozobot.model.Move;

@SuppressWarnings("all")
public class MoveAspectMoveAspectContext {
  public final static MoveAspectMoveAspectContext INSTANCE = new MoveAspectMoveAspectContext();
  
  public static MoveAspectMoveAspectProperties getSelf(final Move _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.MoveAspectMoveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Move, MoveAspectMoveAspectProperties> map = new java.util.WeakHashMap<ozobot.model.Move, ozobot.k3dsa.MoveAspectMoveAspectProperties>();
  
  public Map<Move, MoveAspectMoveAspectProperties> getMap() {
    return map;
  }
}
