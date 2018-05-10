import scripts.paho.mqtt.client as mqtt
import re
import bge

def on_connect(client, userdata, flags, rc):
    print("Connected with result code "+str(rc))
    client.subscribe("home/garden/fountain")

# for no parameter messages
def on_message(client, userdata, msg):
    bge.logic.move_ozobot = False
    bge.logic.rotate_ozobot = False
    print(msg.topic + " " + str(msg.payload))
    payload = str(msg.payload)
    print(payload)
    
    if payload == "b'redLight'":  
       bge.logic.sendMessage("redLight")
    if payload == "b'yellowLight'":  
       bge.logic.sendMessage("yellowLight")
    if payload == "b'greenLight'":  
       bge.logic.sendMessage("greenLight")
    if payload == "b'blueLight'":  
       bge.logic.sendMessage("blueLight")
    if payload == "b'noLight'":  
       bge.logic.sendMessage("noLight")

    if len(payload.split(' ')) == 2:
        parameter_1_message(payload)
    if len(payload.split(' ')) == 3:
        parameter_2_message(payload)
    if len(payload.split(' ')) == 4:
        parameter_3_message(payload)
    
# for one parameter messages    
def paramter_1_message(message):
    print(message)
    msg_type, position = message.split(' ')
    position = float(position[:len(position) - 1])
    if msg_type == "b'ozobot-rotate":
        bge.logic.ozobot_target_position = position
        bge.logic.ozobot_target = True
        print("New ozobot target position: " + str(bge.logic.base_target_position))
    
#for two parameter messages
def parameter_2_message(message):
    print(message)
    msg_type, distance, velocity = message.split(' ')
    distance = float(distance)
    velocity = float(velocity[:len(velocity) - 1])
    if msg_type == "b'ozobot-move":
        ozobot = bge.logic.getCurrentScene().objects["Ozobot"]
        bge.logic.current_xPos = round(ozobot.worldPosition.x,2)
        bge.logic.current_yPos = round(ozobot.worldPosition.y,2)
        bge.logic.move_distance = distance
        bge.logic.move_velocity = velocity
        bge.logic.move_ozobot = True

#for three parameter messages
def parameter_3_message(message):
    print(message)
    msg_type, direction, velocity, angle = message.split(' ')
    direction = direction
    velocity = float(velocity)
    angle = float(angle[:len(angle) - 1])
    if msg_type == "b'ozobot-rotate":
        ozobot = bge.logic.getCurrentScene().objects["Ozobot"]
        bge.logic.currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
        bge.logic.rotate_direction = direction
        bge.logic.rotate_velocity = velocity
        bge.logic.rotate_angle = angle
        bge.logic.rotate_ozobot = True
        bge.logic.rotate_targetAngle += angle
        



class Server:
    def __init__(self):
        self.client = mqtt.Client()
        self.client.on_connect = on_connect
        self.client.on_message = on_message
        self.client.connect("192.168.99.100", 1883, 60)
        print("Connected")
        self.client.loop_start()
    def __del__(self):
        print("Disconnect");
        self.client.loop_stop(force=False)
    
def main():
    
    bge.logic.move_ozobot = False
    bge.logic.rotate_ozobot = False
    bge.logic.rotate_currentOrientation = 0
    bge.logic.rotate_direction = "left"
    bge.logic.rotate_velocity = 0
    bge.logic.rotate_angle = 0
    bge.logic.rotate_targetAngle = 0
    bge.logic.move_distance = 0
    bge.logic.move_velocity = 0
    bge.logic.current_xPos = 0
    bge.logic.current_yPos = 0
  
    bge.logic.server = Server()
    
main()