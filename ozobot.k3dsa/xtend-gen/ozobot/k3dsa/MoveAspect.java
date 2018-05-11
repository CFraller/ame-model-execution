package ozobot.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import ozobot.k3dsa.CommandAspect;
import ozobot.k3dsa.MoveAspectMoveAspectProperties;
import ozobot.model.Move;
import ozobot.model.Velocity;

@Aspect(className = Move.class)
@SuppressWarnings("all")
public class MoveAspect extends CommandAspect {
  @Step
  @OverrideAspectMethod
  public static void sendCommand(final Move _self, final MqttClient client) {
    final ozobot.k3dsa.MoveAspectMoveAspectProperties _self_ = ozobot.k3dsa.MoveAspectMoveAspectContext.getSelf(_self);
     if (_self instanceof ozobot.model.Move){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							ozobot.k3dsa.MoveAspect._privk3_sendCommand(_self_, (ozobot.model.Move)_self,client);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Move","sendCommand");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof ozobot.model.Command){
    					ozobot.k3dsa.CommandAspect.sendCommand((ozobot.model.Command)_self,client);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_sendCommand(final Move _self, final MqttClient client) {
    final ozobot.k3dsa.CommandAspectCommandAspectProperties _self_ = ozobot.k3dsa.CommandAspectCommandAspectContext.getSelf(_self);
     ozobot.k3dsa.CommandAspect._privk3_sendCommand(_self_, _self,client);
  }
  
  protected static void _privk3_sendCommand(final MoveAspectMoveAspectProperties _self_, final Move _self, final MqttClient client) {
    try {
      int _distance = _self.getDistance();
      String _plus = (("ozobot-move" + " ") + Integer.valueOf(_distance));
      String _plus_1 = (_plus + " ");
      Velocity _velocity = _self.getVelocity();
      final String message = (_plus_1 + _velocity);
      byte[] _bytes = message.getBytes();
      final MqttMessage tmp = new MqttMessage(_bytes);
      client.publish(CommandAspect.topic(_self), tmp);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
