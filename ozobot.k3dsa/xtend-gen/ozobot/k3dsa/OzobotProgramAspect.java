package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.BlockAspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.model.OzobotProgram;

@Aspect(className = OzobotProgram.class)
@SuppressWarnings("all")
public class OzobotProgramAspect extends NamedElementAspect {
  public static void initialize(final OzobotProgram _self) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);;
  }
  
  protected static void _privk3_initialize(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    String _name = _self.getName();
    String _plus = ("Program " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    BlockAspect.initialize(_self.getBlock());
    _self.setCurrent(_self.getBlock().getCommands().get(0));
  }
}
