import java.util.Scanner;

public class FizzBuzz
{
	public static void main( String[] args )
	{
	
	Scanner keyboard = new Scanner(System.in);
	//String Fizz, Buzz, FizzBuzz;
	
	for ( int n = 1 ; n <= 100 ; n++ )
	{
		if ( n % 3 == 0 && n % 15 != 0 )
		{
			System.out.print( "Fizz\n" );
		}
		else if ( n % 5 == 0 && n % 15 != 0)
		{
			System.out.print( "Buzz\n" );
		}
		else if ( n % 15 == 0 )
		{
			System.out.print( "FIZZBUZZ!\n" );	
		}
		else
		{
			System.out.println(n);
		}
	
	//System.out.println(n);
	}

	}
}
