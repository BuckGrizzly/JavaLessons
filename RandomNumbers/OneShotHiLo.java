import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int guess;
		
		System.out.println( "I'm thinking of a number between 1-100. Try to guess it. ");
		System.out.print( "> " );
		guess = keyboard.nextInt();
		System.out.println( " " );
		
		int x = 1 + r.nextInt(100);

		if ( x == guess )
			System.out.println( "You guessed it!  What are the odds?!? " );
		else if ( x > guess )
			System.out.println( "Sorry, you are too low. I was thinking of " + x );
		else if ( x < guess )
			System.out.println( "Sorry, you are too high. I was thinking of " + x );

	}
}
