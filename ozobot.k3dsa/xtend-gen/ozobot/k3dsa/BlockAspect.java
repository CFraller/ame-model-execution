package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.BlockAspectBlockAspectProperties;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.NamedElementAspect;
import ozobot.model.Block;
import ozobot.model.Command;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends NamedElementAspect {
  @Step
  public static void initialize(final Block _self) {
    final ozobot.k3dsa.BlockAspectBlockAspectProperties _self_ = ozobot.k3dsa.BlockAspectBlockAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Block","initialize");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_initialize(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    String _name = _self.getName();
    String _plus = ("Block " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    final Consumer<Command> _function = (Command c) -> {
      CommandAspect.initialize(c);
    };
    _self.getCommands().forEach(_function);
  }
}
