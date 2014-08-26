import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int guess;
		
		System.out.println( "I'm thinking of a number from 1 to 10. ");
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		System.out.println( " " );
		
		int x = 1 + r.nextInt(10);

		if ( x == guess )
			System.out.println( "That's right! My secret number was " + x );
		else if ( x != guess )
			System.out.println( "Sorry, but I was really thinking of " + x );

	}
}
