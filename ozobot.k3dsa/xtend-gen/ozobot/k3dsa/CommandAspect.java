package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.model.Command;

@Aspect(className = Command.class)
@SuppressWarnings("all")
public abstract class CommandAspect extends NamedElementAspect {
}
