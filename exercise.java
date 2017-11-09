package returnFunctions;

/*
Lesson _05
In this exercise, you will use return functions to calculate the slope between 2 points and the distance between 2 points

If the variable var is equal to 1 then calculate the distance between 2 points
Else If variable var is equal to 2 then calculate the slope between 2 points
Else var does not have an appropriate value.

Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */

public class exercise
{
	public static void main(String[]args)
	{
		int var = 1;
		double x1 = 0;
		double y1 = 0;
		double x2 = 5;
		double y2 = 5;
		
		
		if (var == 1)
			System.out.println("The distance between the two points is " + calcDist(x1, y1, x2, y2)); 
		else if (var == 2)
			System.out.println("The slope of the two points is " + calcSlope(x1, y1, x2, y2)); 
		else 
			System.out.println("You're stupid haha"); 
		
	}

	
	static double calcDist(double numx1, double numy1, double numx2, double numy2)//make sure you enter parameters
	{
		return Math.pow(Math.pow(numy2-numy1, 2) + Math.pow(numx2-numx1, 2), .5); 
	}
	
	static double calcSlope(double numx1, double numy1, double numx2, double numy2)//make sure you enter parameters
	{
		return ((numy2-numy1)/(numx2-numx1)); 
	}
}
