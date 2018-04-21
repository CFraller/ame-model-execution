package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.model.Wait;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends CommandAspect {
}
