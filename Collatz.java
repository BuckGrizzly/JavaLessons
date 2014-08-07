import java.util.Scanner;

public class Collatz
{
	public static void main( String[] args )
	{
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print( "Starting number: ");	
	int number = keyboard.nextInt();
	
		while ( number > 1 )
		{
			if ( number % 2 == 0 )
				number = number / 2;
			
			else
				number = (number * 3) + 1;
			
			System.out.print(number + "\t");
		}	 
	
	}
}
