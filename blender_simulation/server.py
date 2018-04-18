#import paho.mqtt.client as mqtt
import re
import bge

def on_connect(client, userdata, flags, rc):
    print("Connected with result code "+str(rc))
    client.subscribe("Actuator")

# for no parameter messages
def on_message(client, userdata, msg):

    print(msg.topic + " " + str(msg.payload))
    payload = str(msg.payload)
    print(payload)

    if len(payload.split(' ')) == 2:
        paramter_1_message(payload)
    if len(payload.split(' ')) == 3:
        paramter_2_message(payload)
    
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
    msg_type, position, speed = message.split(' ')
    position = float(position)
    speed = float(speed[:len(speed) - 1])
    if msg_type == "b'ozobot-move":
        bge.logic.ozobot_target_position = position
        bge.logic.ozobot_target_speed = speed
        bge.logic.ozobot_target = True
        print("New ozobot target position: " + str(bge.logic.base_target_position))

class Server:
    def __init__(self):
        self.client = mqtt.Client()
        self.client.on_connect = on_connect
        self.client.on_message = on_message
        self.client.connect("localhost", 1883, 60)
        print("Connected")
        self.client.loop_start()
    def __del__(self):
        print("Disconnect");
        self.client.loop_stop(force=False)
    
def main():

    bge.logic.ozobot_target_position = 1
    bge.logic.ozobot_target_speed = 0.0
    bge.logic.ozobot_target = True
    bge.logic.ozobot_rotation_speed = 0.1

    #bge.logic.server = Server()