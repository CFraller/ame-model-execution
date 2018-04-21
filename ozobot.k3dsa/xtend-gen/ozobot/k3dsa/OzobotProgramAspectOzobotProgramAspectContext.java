package ozobot.k3dsa;

import java.util.Map;
import ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.model.OzobotProgram;

@SuppressWarnings("all")
public class OzobotProgramAspectOzobotProgramAspectContext {
  public final static OzobotProgramAspectOzobotProgramAspectContext INSTANCE = new OzobotProgramAspectOzobotProgramAspectContext();
  
  public static OzobotProgramAspectOzobotProgramAspectProperties getSelf(final OzobotProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OzobotProgram, OzobotProgramAspectOzobotProgramAspectProperties> map = new java.util.WeakHashMap<ozobot.model.OzobotProgram, ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties>();
  
  public Map<OzobotProgram, OzobotProgramAspectOzobotProgramAspectProperties> getMap() {
    return map;
  }
}
