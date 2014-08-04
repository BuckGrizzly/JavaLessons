import java.util.Random;
import java.util.Scanner;

public class KeepGuessing
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int guess = 7;
		
		System.out.println( "I have chosen a number from 1 to 10. Try to guess it. ");
		System.out.print( "Your guess: " );
		int entry = keyboard.nextInt();

		while ( entry != guess )
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			entry = keyboard.nextInt();
		}

		System.out.println("That's right! You're a good guesser!");

	}
}
