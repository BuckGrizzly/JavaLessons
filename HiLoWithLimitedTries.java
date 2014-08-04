import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int guess = 66, guesses = 1, tries = 0, maxTries = 7;
		
		System.out.println( "I thinking of a number between 1-100. You have 7 guesses. ");
		System.out.print( "First guess: " );
		int entry = keyboard.nextInt();
		tries++;

		while ( entry != guess && tries < maxTries )
		{
			if (entry < guess)
			{
				System.out.println("Sorry, you are too low.");
				guesses = guesses + 1;
				System.out.print("Guess # " + guesses + ": ");
				entry = keyboard.nextInt();
				tries++;
			}
			if ( entry > guess )
			{
				System.out.println("Sorry, that guess is too high.");
				guesses = guesses + 1;
				System.out.print("Guess # " + guesses + ": ");
				entry = keyboard.nextInt();
				tries++;
			}
		}
		if ( entry == guess )
		{
			System.out.println("That's right! You're a good guesser!");
			System.out.println("It only took you " + guesses + " tries.");
		}
		else if ( tries >= maxTries )
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose Jedi.");
		}	
		
	}
}

