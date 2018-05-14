package ozobot.xdsml.ozobotl.aspects;

import java.util.Map;
import ozobot.xdsml.ozobotl.aspects.BlockAspectBlockAspectProperties;
import ozobot.xdsml.ozobotl.model.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public final static BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ozobot.xdsml.ozobotl.aspects.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<ozobot.xdsml.ozobotl.model.Block, ozobot.xdsml.ozobotl.aspects.BlockAspectBlockAspectProperties>();
  
  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
