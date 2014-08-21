import java.util.Scanner;

public class AddingValuesWithAForLoop
{
	public static void main( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		int num;
		int count = 0;
		
		System.out.print( "Number: " );
		num = keyboard.nextInt();
		
		for ( int n = 1 ; n <= num ; n = n + 1 )
		{
			System.out.print(n + " ");
			count = count + n;
		
		}
		System.out.println( "\nThe sum is " + count + "." );	
	
	}

}
