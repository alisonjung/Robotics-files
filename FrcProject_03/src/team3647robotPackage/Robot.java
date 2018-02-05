package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;


public class Robot extends IterativeRobot 

{	
	double leftJoySticky; 
	double rightSpeed;
	double leftSpeed;
	double adjustment = 0.005; 
	double distance = 1400; 
	double leftEncoderValue;
	double rightEncoderValue; 
	
	//This function is run whenever the robot starts. This function is used for any initialization of code
	Encoders encodersObject;
	@Override
	public void robotInit() 
	{
		encodersObject = new Encoders(); 
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{
		encodersObject.resetEncoders(); 
	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{
		 leftEncoderValue = encodersObject.getleftEncoders(); 
		 rightEncoderValue = encodersObject.getleftEncoders(); 
	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		leftSpeed=leftJoySticky; 
		rightSpeed=leftJoySticky; 
//		Motors.leftMotor.set(Joysticks.leftJoySticky);
//		Motors.rightMotor.set(-Joysticks.leftJoySticky);
		double leftEncoderValue = encodersObject.getleftEncoders(); 
		double rightEncoderValue = encodersObject.getrightEncoders(); 
		double leftspeed = Joysticks.leftJoySticky;
		double rightspeed  = Joysticks.leftJoySticky;
		
		if(leftJoySticky > 0)//forward
		{
			if(Math.abs(leftEncoderValue-rightEncoderValue) < 6) // going correctly
			{
				Motors.leftMotor.set(leftspeed);
				Motors.rightMotor.set(-rightspeed);
			}
			else//not going correctly
			{
				if(leftEncoderValue>rightEncoderValue)
				{
					Motors.leftMotor.set((leftspeed-.15));
					Motors.rightMotor.set(-(rightspeed+.15));
				}
				else // leftEncoderValue<rightEncoderValue
				{
					Motors.leftMotor.set((leftspeed+.15));
					Motors.rightMotor.set(-(rightspeed-.15));
				}
			}
		}
		else if(leftJoySticky < 0)//backwards so a lot is reversed
		{
			if(Math.abs(leftEncoderValue-rightEncoderValue) < 6) // going correctly
			{
				Motors.leftMotor.set(leftSpeed);
				Motors.rightMotor.set(-rightSpeed);
			}
			else//not going correctly
			{
				if(leftEncoderValue>rightEncoderValue) //right Value greater than left
				{
					Motors.leftMotor.set((leftspeed-.15)); //left speed made greater
					Motors.rightMotor.set(-(rightspeed+.15)); //right speed - so slow down
				}
				else // leftEncoderValue<rightEncoderValue aka left value greater 
				{
					Motors.leftMotor.set((leftspeed +.15)); //left speed made smaller
					Motors.rightMotor.set(-(rightspeed-.15)); //right speed made greater
				}
			}
		}
		else//else
		{
			Motors.leftMotor.set(0);
			Motors.rightMotor.set(0);
		}
		
	}
		
		

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

