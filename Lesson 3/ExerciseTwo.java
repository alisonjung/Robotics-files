package Exercises;

/*
Lesson _03
In this exercise, you will use nested for loops in order to print the following:
 \:::::::/
  \:::::/
   \:::/
    \:/

Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */

public class ExerciseTwo 
{
	public static void main(String[]args)
	{

		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<i+1; j++) 
			{
				System.out.print(" "); 
			}
			System.out.print("\\");
			for(int j=1; j<=9-(2 * i); j++)
			{
				System.out.print(":");
			}
			{
				System.out.print("/");
			}
			System.out.println();
			
		}
		
	}

}
	

