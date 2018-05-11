package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.model.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect extends NamedElementAspect {
}
