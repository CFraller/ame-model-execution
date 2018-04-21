package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.model.Move;

@Aspect(className = Move.class)
@SuppressWarnings("all")
public class MoveAspect extends CommandAspect {
}
