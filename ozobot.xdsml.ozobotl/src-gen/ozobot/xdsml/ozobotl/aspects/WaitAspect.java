package ozobot.xdsml.ozobotl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.xdsml.ozobotl.aspects.CommandAspect;
import ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties;
import ozobot.xdsml.ozobotl.model.Wait;

@Aspect(className = Wait.class)
@SuppressWarnings("all")
public class WaitAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Wait _self, final MqttClient client) {
	final ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.WaitAspectWaitAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_executeCommand(_self_, _self, client);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Wait", "executeCommand");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_executeCommand(final Wait _self, final MqttClient client) {
    final ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectProperties _self_ = ozobot.xdsml.ozobotl.aspects.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.xdsml.ozobotl.aspects.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final WaitAspectWaitAspectProperties _self_, final Wait _self, final MqttClient client) {
    String _name = _self.getName();
    String _plus = ("Executed command " + _name);
    InputOutput.<String>println(_plus);
  }
}
