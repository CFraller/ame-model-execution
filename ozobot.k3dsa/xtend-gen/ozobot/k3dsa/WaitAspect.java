package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.WaitAspectWaitAspectProperties;
import ozobot.model.Wait;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Wait _self, final MqttClient client) {
    final ozobot.k3dsa.WaitAspectWaitAspectProperties _self_ = ozobot.k3dsa.WaitAspectWaitAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Wait){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.WaitAspect._privk3_executeCommand(_self_, (ozobot.model.Wait)_self,client);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self, new Object[] {client}, command, "Wait", "executeCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.executeCommand((ozobot.model.Command)_self,client);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_executeCommand(final Wait _self, final MqttClient client) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final WaitAspectWaitAspectProperties _self_, final Wait _self, final MqttClient client) {
    String _name = _self.getName();
    String _plus = ("Executed command " + _name);
    InputOutput.<String>println(_plus);
  }
}
