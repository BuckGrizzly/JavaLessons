import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		int one, two, three;
	
	
		System.out.println( "Enter three integers: ");
		System.out.print( "Side 1: ");
		one = keyboard.nextInt();
	
		do
		{
			System.out.print( "Side 2: ");
			two = keyboard.nextInt();
	
			if ( two < one )
			{
				System.out.println( two + " is smaller than " + one + ".  Try again. ");	
			}
			else
			{
				System.out.print( "");
			}

		} while (two < one);
	
		do
		{
			System.out.print( "Side 3: ");
			three = keyboard.nextInt();
	
			if ( three < two )
			{
				System.out.println( three + " is smaller than " + two + ".  Try again. ");	
			}
			else
			{
				System.out.print( " ");
			}
	
		} while (three < two);
	
		if ( (one*one + two*two) == (three*three) )
		{
			System.out.println( "Your three sides are " + one + " " + two + " " + three );
			System.out.println( "These sides *do* make a right triangle. Yippy-skippy! ");
		}
		else 
		{
 			System.out.println( "Your three sides are " + one + " " + two + " " + three );
			System.out.println( "NO! These sides do not make a right triangle!" );
 		}		
	}
}