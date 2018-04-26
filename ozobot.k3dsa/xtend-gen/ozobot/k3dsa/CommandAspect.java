package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.CommandAspectCommandAspectProperties;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.model.Command;

@Aspect(className = Command.class)
@SuppressWarnings("all")
public abstract class CommandAspect extends NamedElementAspect {
  public static void initialize(final Command _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Repeat){
    					ozobot.k3dsa.RepeatAspect.initialize((ozobot.model.Repeat)_self);
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect._privk3_initialize(_self_, (ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_initialize(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    String _name = _self.getName();
    String _plus = ("Command " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
  }
}
