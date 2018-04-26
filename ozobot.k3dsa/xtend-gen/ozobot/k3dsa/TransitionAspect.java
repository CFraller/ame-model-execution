package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.k3dsa.TransitionAspectTransitionAspectProperties;
import ozobot.model.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect extends NamedElementAspect {
  public static void next(final Transition _self) {
    final ozobot.k3dsa.TransitionAspectTransitionAspectProperties _self_ = ozobot.k3dsa.TransitionAspectTransitionAspectContext.getSelf(_self);
    _privk3_next(_self_, _self);;
  }
  
  protected static void _privk3_next(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Next " + _name);
    String _plus_1 = (_plus + " and entering ");
    String _name_1 = _self.getTarget().getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
  }
}
