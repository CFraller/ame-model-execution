import bge
import math
from math import pi

def rad(degree):
    rad = round(degree*pi/180,2)
    return rad

def degree(rad):
    degree = round(rad*180/pi,2)
    return degree

def roundedPi():
    roundedPi = round(pi,2)
    return roundedPi    

def rotate(direction,velocity,angle):
    velocity = velocity/100
    if(direction == "Left"):
        rotateToLeft(angle, velocity)
    if(direction == "Right"):
        rotateToRight(angle,velocity)    

def rotateToLeft(rotationDegree,rotationSpeed):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    targetOrientation = rad(rotationDegree)
    if(currentOrientation <= targetOrientation and currentOrientation >= 0):
        ozobot.applyRotation((0, 0, rotationSpeed), True)
    else:
        if(rotationDegree > 180):
            targetOrientation = rad(rotationDegree-180) - roundedPi()  
            if(currentOrientation <= targetOrientation and currentOrientation < -0.03):
                ozobot.applyRotation((0, 0, rotationSpeed), True)
    print(currentOrientation)
    
def rotateToRight(rotationDegree,rotationSpeed):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    targetOrientation = (-1)*rad(rotationDegree)
    if(currentOrientation >= targetOrientation and currentOrientation <= 0):
        ozobot.applyRotation((0, 0, -rotationSpeed), True)
    else:
        if(rotationDegree > 180):
            targetOrientation = roundedPi() - rad(rotationDegree-180) 
            if(currentOrientation >= targetOrientation and currentOrientation > 0.03):
                ozobot.applyRotation((0, 0, -rotationSpeed), True)
    print(currentOrientation)

def move(distance,velocity):
    velocity = velocity/20
    angle = degree(round(ozobot.localOrientation.to_euler().z,2))
    if(angle < 0):
        angle = 180 + (180+angle)
    xTargetPos = round(distance * math.cos(math.radians(angle)),2)
    yTargetPos = round(distance * math.sin(math.radians(angle)),2)
    xCurrentPos = round(ozobot.worldPosition.x,2)
    yCurrentPos = round(ozobot.worldPosition.y,2)
    if(xCurrentPos < xTargetPos and xTargetPos > 0):
        ozobot.applyMovement((velocity,0,0),False)
    if(xCurrentPos > xTargetPos and xTargetPos < 0):
        ozobot.applyMovement((-velocity,0,0),False)
    if(yCurrentPos < yTargetPos and yTargetPos > 0):
        ozobot.applyMovement((0,velocity,0),False)
    if(yCurrentPos > yTargetPos and yTargetPos < 0):
        ozobot.applyMovement((0,-velocity,0),False)
    print(xCurrentPos)
    print(yCurrentPos)
    print(angle)
    
ozobot = bge.logic.getCurrentScene().objects["Ozobot"]
#rotate("Left",3,270)
#rotate("Right",1,90)
#rotate("Right",5,360)

move(20,5)