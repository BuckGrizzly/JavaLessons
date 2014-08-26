import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int guess;
		
		System.out.println( "You slide up to Fast Eddie's card table and plop down your cash. ");
		System.out.println( "He glances at you out of the corner of his eye and starts shuffling. ");
		System.out.println( "He lays down three cards. ");
		System.out.println( " " );
		System.out.println( "Which one is the ace? ");
		System.out.println( "\t ## \t ## \t ## " );
		System.out.println( "\t ## \t ## \t ## " );
		System.out.println( "\t 1  \t 2  \t 3  " );
		System.out.println( " " );
		System.out.print( ">" );
		guess = keyboard.nextInt();
		System.out.println( " " );
		
		
		int x = 1 + r.nextInt(3);

		if ( guess == x  )
		{
			System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling. " );
			System.out.println( " " );

			if ( guess == 1 )
			{
				System.out.println( "\t AA \t ## \t ## " );
				System.out.println( "\t AA \t ## \t ## " );
				System.out.println( "\t 1  \t 2  \t 3  " );
			}
			if ( guess == 2 )
			{
				System.out.println( "\t ## \t AA \t ## " );
				System.out.println( "\t ## \t AA \t ## " );
				System.out.println( "\t 1  \t 2  \t 3  " );
			}		
			if ( guess == 3 )
			{
				System.out.println( "\t ## \t ## \t AA " );
				System.out.println( "\t ## \t ## \t AA " );
				System.out.println( "\t 1  \t 2  \t 3  " );
			}		
		}
		if ( guess != x )
		{
			System.out.println( "Ha! Fast Eddie wins again! The ace was card number " + x );
			System.out.println( " " );

			if ( x == 1 )
			{
				System.out.println( "\t AA \t ## \t ## " );
				System.out.println( "\t AA \t ## \t ## " );
				System.out.println( "\t 1  \t 2  \t 3  " );
			}
			if ( x == 2 )
			{
				System.out.println( "\t ## \t AA \t ## " );
				System.out.println( "\t ## \t AA \t ## " );
				System.out.println( "\t 1  \t 2  \t 3  " );
			}		
			if ( x == 3 )
			{
				System.out.println( "\t ## \t ## \t AA " );
				System.out.println( "\t ## \t ## \t AA " );
				System.out.println( "\t 1  \t 2  \t 3  " );
			}		
		}

	}
}