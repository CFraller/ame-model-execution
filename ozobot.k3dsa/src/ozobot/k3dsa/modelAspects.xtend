package ozobot.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ozobot.model.NamedElement
import ozobot.model.OzobotProgram
import ozobot.model.Command
import ozobot.model.Move
import ozobot.model.Light
import ozobot.model.Rotate
import ozobot.model.Wait
import ozobot.model.Repeat
import ozobot.model.Ozobot
import ozobot.model.Block
import ozobot.model.Transition

import static extension ozobot.k3dsa.NamedElementAspect.*
import static extension ozobot.k3dsa.OzobotProgramAspect.*
import static extension ozobot.k3dsa.CommandAspect.*
import static extension ozobot.k3dsa.MoveAspect.*
import static extension ozobot.k3dsa.LightAspect.*
import static extension ozobot.k3dsa.RotateAspect.*
import static extension ozobot.k3dsa.WaitAspect.*
import static extension ozobot.k3dsa.RepeatAspect.*
import static extension ozobot.k3dsa.OzobotAspect.*
import static extension ozobot.k3dsa.BlockAspect.*
import static extension ozobot.k3dsa.TransitionAspect.*

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=OzobotProgram)
class OzobotProgramAspect extends NamedElementAspect {

}

@Aspect(className=Command)
abstract class CommandAspect extends NamedElementAspect {

}

@Aspect(className=Move)
class MoveAspect extends CommandAspect {

}

@Aspect(className=Light)
class LightAspect extends CommandAspect {

}

@Aspect(className=Rotate)
class RotateAspect extends CommandAspect {

}

@Aspect(className=Wait)
class WaitAspect extends CommandAspect {

}

@Aspect(className=Repeat)
class RepeatAspect extends CommandAspect {
	public int loopCounter

}

@Aspect(className=Ozobot)
class OzobotAspect extends NamedElementAspect {
	public float xposition
	public float yposition
	public float orientation 

}

@Aspect(className=Block)
class BlockAspect extends NamedElementAspect {

}

@Aspect(className=Transition)
class TransitionAspect extends NamedElementAspect {

}



