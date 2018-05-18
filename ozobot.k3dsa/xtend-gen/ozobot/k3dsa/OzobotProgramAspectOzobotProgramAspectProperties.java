package ozobot.k3dsa;

import java.util.Timer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import ozobot.model.Command;

@SuppressWarnings("all")
public class OzobotProgramAspectOzobotProgramAspectProperties {
  public MqttClient client;
  
  public Timer timer;
  
  public long startTime;
  
  public long elapsedTime;
  
  public Command currentCommand;
}
