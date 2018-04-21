package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.model.Block;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends NamedElementAspect {
}
