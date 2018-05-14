package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.RotateAspectRotateAspectProperties;
import ozobot.model.Direction;
import ozobot.model.Rotate;
import ozobot.model.Velocity;

@Aspect(className = Rotate.class)
@SuppressWarnings("all")
public class RotateAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void executeCommand(final Rotate _self, final MqttClient client) {
    final ozobot.k3dsa.RotateAspectRotateAspectProperties _self_ = ozobot.k3dsa.RotateAspectRotateAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Rotate){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.RotateAspect._privk3_executeCommand(_self_, (ozobot.model.Rotate)_self,client);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self, new Object[] {client}, command, "Rotate", "executeCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.executeCommand((ozobot.model.Command)_self,client);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_executeCommand(final Rotate _self, final MqttClient client) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_executeCommand(_self_, _self,client);
  }
  
  protected static void _privk3_executeCommand(final RotateAspectRotateAspectProperties _self_, final Rotate _self, final MqttClient client) {
    try {
      Direction _direction = _self.getDirection();
      String _plus = (("ozobot-rotate" + " ") + _direction);
      String _plus_1 = (_plus + " ");
      Velocity _velocity = _self.getVelocity();
      String _plus_2 = (_plus_1 + _velocity);
      String _plus_3 = (_plus_2 + " ");
      float _angle = _self.getAngle();
      final String message = (_plus_3 + Float.valueOf(_angle));
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
      String _name = _self.getName();
      String _plus_4 = ("Executed command " + _name);
      InputOutput.<String>println(_plus_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
