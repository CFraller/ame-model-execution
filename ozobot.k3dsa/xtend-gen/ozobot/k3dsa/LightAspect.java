package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.model.Light;

@Aspect(className = Light.class)
@SuppressWarnings("all")
public class LightAspect extends CommandAspect {
}
