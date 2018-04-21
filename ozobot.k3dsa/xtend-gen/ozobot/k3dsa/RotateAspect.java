package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.model.Rotate;

@Aspect(className = Rotate.class)
@SuppressWarnings("all")
public class RotateAspect extends CommandAspect {
}
