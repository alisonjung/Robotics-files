package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot 
{	
	//The speed of the robot while running the program
	double speed = 0.3;
	double rightSpeed = 0.3;
	double leftSpeed = 0.3;
	double adjustment = 0.005; 
	double distance = 1400; 
	

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
		double leftEncoderValue = encodersObject.getleftEncoders(); 
		double rightEncoderValue = encodersObject.getrightEncoders(); 
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
		 

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		
	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

