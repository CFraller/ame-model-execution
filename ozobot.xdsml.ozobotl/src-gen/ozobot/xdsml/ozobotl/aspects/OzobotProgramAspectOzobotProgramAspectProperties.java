package ozobot.xdsml.ozobotl.aspects;

import java.util.Timer;
import org.eclipse.paho.client.mqttv3.MqttClient;

@SuppressWarnings("all")
public class OzobotProgramAspectOzobotProgramAspectProperties {
  public MqttClient client;
  
  public Timer timer;
  
  public long startTime;
  
  public long elapsedTime;
}
