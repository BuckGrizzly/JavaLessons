import java.util.Random;
import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x, y;
		
		System.out.println( "I will add up the numbers you give me.");
		System.out.print( "Number: ");
		x = keyboard.nextInt();
		System.out.println( "The total so far is " + x );
		
		while ( x != 0)
		{
			System.out.print( "Number: ");
			y = keyboard.nextInt();
			System.out.println("The total so far is " + (x+y) );
		}
		if ( y == 0 )
		{
			System.out.println( "\nThe total is "); 
		}
	
	}

}
