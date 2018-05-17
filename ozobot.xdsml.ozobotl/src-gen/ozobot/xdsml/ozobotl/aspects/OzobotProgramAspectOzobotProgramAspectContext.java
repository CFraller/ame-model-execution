package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

@SuppressWarnings("all")
public class OzobotProgramAspectOzobotProgramAspectContext {
  public final static OzobotProgramAspectOzobotProgramAspectContext INSTANCE = new OzobotProgramAspectOzobotProgramAspectContext();
  
  public static OzobotProgramAspectOzobotProgramAspectProperties getSelf(final OzobotProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OzobotProgram, OzobotProgramAspectOzobotProgramAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.OzobotProgram, ozobot.xdsml.ozobotl.aspects.OzobotProgramAspectOzobotProgramAspectProperties>();
  
  public Map<OzobotProgram, OzobotProgramAspectOzobotProgramAspectProperties> getMap() {
    return map;
  }
}
