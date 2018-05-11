package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.BlockAspect;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties;
import ozobot.model.OzobotProgram;

@Aspect(className = OzobotProgram.class)
@SuppressWarnings("all")
public class OzobotProgramAspect extends NamedElementAspect {
  @Main
  public static void main(final OzobotProgram _self) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  @Step
  public static void initialize(final OzobotProgram _self) {
    final ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectProperties _self_ = ozobot.k3dsa.OzobotProgramAspectOzobotProgramAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"OzobotProgram","initialize");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_main(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    try {
      while ((_self.getCurrent() != null)) {
        {
          CommandAspect.sendCommand(_self.getCurrent());
          _self.setCurrent(_self.getCurrent().getOutgoing().getTarget());
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static void _privk3_initialize(final OzobotProgramAspectOzobotProgramAspectProperties _self_, final OzobotProgram _self) {
    String _name = _self.getName();
    String _plus = ("Program " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    BlockAspect.initialize(_self.getBlock());
    _self.setCurrent(_self.getBlock().getCommands().get(0));
  }
}
