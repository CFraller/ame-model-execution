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

def rotate(direction,velocity,angle,targetAngle):
    velocity = velocity/100
    if(direction == "left" and angle >= 180):
        rotateToLeft1(angle,velocity)  
    if(direction == "left" and angle < 180):
        rotateToLeft2(angle,velocity,targetAngle) 
    if(direction == "right" and angle >= 180):
        rotateToRight1(angle,velocity)
    if(direction == "right" and angle < 180):
        rotateToRight2(angle,velocity,targetAngle)    

def rotateToLeft1(rotationDegree,rotationSpeed):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    targetOrientation = bge.logic.currentOrientation + rad(rotationDegree)
    if(currentOrientation <= targetOrientation and currentOrientation >= 0):
        ozobot.applyRotation((0, 0, rotationSpeed), True)
    else:
        if(rotationDegree > 180):
            targetOrientation = (-1*bge.logic.currentOrientation) + rad(rotationDegree-180) - roundedPi() 
            if(currentOrientation <= targetOrientation and currentOrientation < -0.03):
                ozobot.applyRotation((0, 0, rotationSpeed), True)
    print(currentOrientation)
    
def rotateToLeft2(rotationDegree,rotationSpeed,targetAngle):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    targetOrientation = bge.logic.currentOrientation + rad(rotationDegree)
    if(currentOrientation <= targetOrientation and currentOrientation >= 0):
        ozobot.applyRotation((0, 0, rotationSpeed), True)
    else:
        if(targetAngle > 180):
            targetOrientation = bge.logic.currentOrientation + rad(rotationDegree) 
            if(currentOrientation <= targetOrientation and currentOrientation < -0.03):
                ozobot.applyRotation((0, 0, rotationSpeed), True)
    print(currentOrientation)
    
def rotateToRight1(rotationDegree,rotationSpeed):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    targetOrientation = bge.logic.currentOrientation + (-1)*rad(rotationDegree)
    if(currentOrientation >= targetOrientation and currentOrientation <= 0):
        ozobot.applyRotation((0, 0, -rotationSpeed), True)
    else:
        if(rotationDegree > 180):
            targetOrientation = (-1*bge.logic.currentOrientation) + roundedPi() - rad(rotationDegree-180) 
            if(currentOrientation >= targetOrientation and currentOrientation > 0.03):
                ozobot.applyRotation((0, 0, -rotationSpeed), True)
    print(currentOrientation)
    
def rotateToRight2(rotationDegree,rotationSpeed,targetAngle):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    targetOrientation = bge.logic.currentOrientation + (-1)*rad(rotationDegree)
    if(currentOrientation >= targetOrientation and currentOrientation <= 0):
        ozobot.applyRotation((0, 0, -rotationSpeed), True)
    else:
        if(targetAngle > 180):
            targetOrientation = bge.logic.currentOrientation - rad(rotationDegree) 
            if(currentOrientation >= targetOrientation and currentOrientation > 0.03):
                ozobot.applyRotation((0, 0, -rotationSpeed), True)
    print(currentOrientation)

def move(distance,velocity):
    velocity = velocity/20
    angle = degree(round(ozobot.localOrientation.to_euler().z,2))
    if(angle < 0):
        angle = 180 + (180+angle)
    xCurrentPos = round(ozobot.worldPosition.x,2)
    yCurrentPos = round(ozobot.worldPosition.y,2)
    xTargetPos = bge.logic.current_xPos + round(distance * math.cos(math.radians(angle)),2)
    yTargetPos = bge.logic.current_yPos + round(distance * math.sin(math.radians(angle)),2)
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

def reset(resetDirection):
    currentOrientation = round(ozobot.localOrientation.to_euler().z,2)
    if(resetDirection == "left"):
        speed = -1*currentOrientation/100
        if(currentOrientation <= 0.00):
            ozobot.applyRotation((0, 0, speed), True)
    else:
        if(resetDirection == "right"):
            speed = currentOrientation/100
        if(currentOrientation >= 0.00):
            ozobot.applyRotation((0, 0, -speed), True)      
    print(currentOrientation)
        
ozobot = bge.logic.getCurrentScene().objects["Ozobot"]

def main():  
    distance = bge.logic.move_distance
    velocity = bge.logic.move_velocity
    direction = bge.logic.rotate_direction
    velocityR = bge.logic.rotate_velocity
    angle = bge.logic.rotate_angle
    targetAngle = bge.logic.rotate_targetAngle
    resetDirection = bge.logic.reset_direction
    
    if (bge.logic.move_ozobot):
        move(distance,velocity)
    if (bge.logic.rotate_ozobot):
        print(direction)
        print(velocityR)
        print(angle)
        print(targetAngle)
        rotate(direction,velocityR,angle, targetAngle)
    if (bge.logic.reset_ozobot):
        reset(resetDirection)  
    
main()