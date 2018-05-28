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
  public static void executeCommand(final Light _self) {
    final ozobot.k3dsa.LightAspectLightAspectProperties _self_ = ozobot.k3dsa.LightAspectLightAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Light){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.LightAspect._privk3_executeCommand(_self_, (ozobot.model.Light)_self);
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
    					ozobot.k3dsa.CommandAspect.executeCommand((ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static void createMessage(final Light _self) {
    final ozobot.k3dsa.LightAspectLightAspectProperties _self_ = ozobot.k3dsa.LightAspectLightAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Light){
    					ozobot.k3dsa.LightAspect._privk3_createMessage(_self_, (ozobot.model.Light)_self);
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.createMessage((ozobot.model.Command)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_executeCommand(final Light _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self);
  }
  
  protected static void _privk3_executeCommand(final LightAspectLightAspectProperties _self_, final Light _self) {
    try {
      LightAspect.createMessage(_self);
      final MqttClient client = CommandAspect.getMQTTClient(_self);
      byte[] _bytes = CommandAspect.message(_self).getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus = ("Executed command " + _name);
      String _plus_1 = (_plus + " on topic: ");
      String _pic = CommandAspect.topic(_self);
      String _plus_2 = (_plus_1 + _pic);
      String _plus_3 = (_plus_2 + " with Message: ");
      String _message = CommandAspect.message(_self);
      String _plus_4 = (_plus_3 + _message);
      InputOutput.<String>println(_plus_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static void super_createMessage(final Light _self) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_createMessage(_self_, _self);
  }
  
  protected static void _privk3_createMessage(final LightAspectLightAspectProperties _self_, final Light _self) {
    Color _color = _self.getColor();
    String _plus = (_color + "Light");
    CommandAspect.message(_self, _plus);
  }
}
