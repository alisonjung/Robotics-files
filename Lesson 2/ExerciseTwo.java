package exercises;

/*
Lesson _02
In this exercise, you will use if statements, relational and logical operators to complete this exercise.
In this exercise you will use 6 booleans to determine if the robot is Moving forward, backward, right or left
For example:
if(rightMotorMovingForward && leftMotorMovingForward)
{
	movingStatus = "Robot is moving forward";
}
if(rightMotorMovingForward && leftMotorMovingBackward)
{
	movingStatus = "Robot is spinning towards the right";
}
Good Luck Completing the exercise!

Clue:
Only one right side motor and left side motor boolean can be set to true. So for example: If rightMotorMovingForward = true; rightMotorMovingBackward and rightMotorNotMoving should be set to false.
This is because if the rightMotor is moving forward, then the rightMotor can't be moving backward or not moving.
*/

/*
 * @author Surya
 */

public class ExerciseTwo 
{
	public static void main(String[] args) 
	{
		 boolean rightMotorMovingForward, leftMotorMovingForward, rightMotorMovingBackward, leftMotorMovingBackward, rightMotorNotMoving, leftMotorNotMoving;
		 String movingStatus;
		 rightMotorMovingForward = true; 
		 leftMotorMovingForward = true; 
		 rightMotorMovingBackward = false;
		 leftMotorMovingBackward = false;
		 rightMotorNotMoving = false; 
		 leftMotorNotMoving = false;
		 if(rightMotorMovingForward && leftMotorMovingForward)
		 {
		 	movingStatus = "Robot is moving forward";
		 	System.out.println(movingStatus);

		 }
		 else if(rightMotorMovingForward && leftMotorMovingBackward)
		 {
		 	movingStatus = "Robot is spinning towards the right";
		 	System.out.println(movingStatus);
		 }
		 else if(rightMotorMovingForward && leftMotorNotMoving)
		 {
		 	movingStatus = "Robot is spinning towards the right";
		 	System.out.println(movingStatus);

		 }
		 else if(rightMotorNotMoving && leftMotorMovingForward)
		 {
			 movingStatus = "Robot is spinning toward the left"; 
			 	System.out.println(movingStatus);

		 }
		 else if(rightMotorMovingBackward && leftMotorNotMoving)
		 {
			 movingStatus = "Robot is spinning toward the right"; 
			 	System.out.println(movingStatus);

		 }
		 
		 else if(rightMotorMovingBackward && leftMotorMovingForward)
		 {
			 movingStatus = "Robot is spinning towards the left";
			 	System.out.println(movingStatus);

		 }
		 else if(rightMotorMovingBackward && leftMotorMovingBackward)
		 {
			 movingStatus = "Robot is moving backward";
			 	System.out.println(movingStatus);

		 }
		 else if(rightMotorNotMoving && leftMotorNotMoving)
		 {
			 movingStatus = "Robot is not moving"; 
			 	System.out.println(movingStatus);

		 }
		 else {
			 System.out.println("None");

		 }
		
	}

}
