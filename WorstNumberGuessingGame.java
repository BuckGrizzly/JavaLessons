import java.util.Scanner;

public class WorstNumberGuessingGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int guess = 7;
		
		System.out.println( "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1! ");
		System.out.print( "I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		int entry = keyboard.nextInt();

		if ( entry != guess )
		{
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + entry);
		}
		else
		{
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + entry);
		}
		
	}
}

