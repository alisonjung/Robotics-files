package org.usfirst.frc.team3647.robot;

import team3647robotPackage.Motors;

public class Autonomous 
{
	String autoSelected = "middleAuto";
	
	public void runAuto(double lEnc, double rEnc)
	{
		if(autoSelected.equals("middleAuto"))
		{
			middleAuto(lEnc, rEnc);
		}
		else if(autoSelected.equals("rightAuto"))
		{
			rightAuto(lEnc, rEnc);
		}
		else if(autoSelected.equals("leftAuto"))
		{
			leftAuto(lEnc, rEnc);
		}
		else
		{
			Motors.leftSRX.set(0);
			Motors.rightSRX.set(0);
		}
	}
	
	public void PID()
	{
		double rightEncoderValue;
		double leftEncoderValue;
		double distance = 1400;
		double leftSpeed; 
		double rightSpeed; 
		double adjustment = 0.005;
		
		if((rightEncoderValue + leftEncoderValue)/2<distance) 
		{
			if(leftEncoderValue != rightEncoderValue)
			{
				if (leftEncoderValue>rightEncoderValue)
				{
					leftSpeed -= adjustment;
					rightSpeed += adjustment;
				}
				else
				{
					leftSpeed += adjustment;
					rightSpeed -= adjustment;
				}	
			}
			Motors.leftMotor.set(leftSpeed);
			Motors.rightMotor.set(-rightSpeed);
		}
		else
		{
			Motors.leftMotor.set(0);
			Motors.rightMotor.set(0);
		}	
	}
	
	public void middleAuto(double lEnc, double rEnc)
	{
		
	}
	
	public void rightAuto(double lEnc, double rEnc)
	{
		
	}
	
	public void leftAuto(double lEnc, double rEnc)
	{
		
	}
	

}
