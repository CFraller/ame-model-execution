package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.LightAspectLightAspectProperties;
import ozobot.model.Light;

@Aspect(className = Light.class)
@SuppressWarnings("all")
public class LightAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void sendCommand(final Light _self) {
    final ozobot.k3dsa.LightAspectLightAspectProperties _self_ = ozobot.k3dsa.LightAspectLightAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Light){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.LightAspect._privk3_sendCommand(_self_, (ozobot.model.Light)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Light","sendCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.sendCommand((ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_sendCommand(final Light _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_sendCommand(_self_, _self);
  }
  
  protected static void _privk3_sendCommand(final LightAspectLightAspectProperties _self_, final Light _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field client is undefined"
      + "\npublish cannot be resolved");
  }
}
