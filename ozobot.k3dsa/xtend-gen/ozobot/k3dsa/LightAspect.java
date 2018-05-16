package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.LightAspectLightAspectProperties;
import ozobot.model.Color;
import ozobot.model.Light;

@Aspect(className = Light.class)
@SuppressWarnings("all")
public class LightAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Light _self, final MqttClient client) {
    final ozobot.k3dsa.LightAspectLightAspectProperties _self_ = ozobot.k3dsa.LightAspectLightAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Light){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.LightAspect._privk3_executeCommand(_self_, (ozobot.model.Light)_self,client);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Light","executeCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.executeCommand((ozobot.model.Command)_self,client);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_executeCommand(final Light _self, final MqttClient client) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final LightAspectLightAspectProperties _self_, final Light _self, final MqttClient client) {
    try {
      Color _color = _self.getColor();
      final String message = (_color + "Light");
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus = ("Executed command " + _name);
      String _plus_1 = (_plus + " on topic: ");
      String _pic = CommandAspect.topic(_self);
      String _plus_2 = (_plus_1 + _pic);
      String _plus_3 = (_plus_2 + " with Message: ");
      String _plus_4 = (_plus_3 + message);
      InputOutput.<String>println(_plus_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
