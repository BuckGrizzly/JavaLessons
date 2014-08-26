import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 1;
		while ( n < 11 )
		{
			System.out.println( (n*10) + ". " + message );
			//This causes an infinite loop if removed
			n++;
		}

	}
}