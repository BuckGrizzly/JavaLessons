import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print( "Count from: ");
		num1 = keyboard.nextInt();
		System.out.print( "Count to: ");
		num2 = keyboard.nextInt();
		System.out.print( "Count by: ");
		num3 = keyboard.nextInt();
		
		for ( int n = num1 ; n <= num2 ; n = n + num3 )
		{
			System.out.print( n + " " );
		}
	
	
	
	
	}
}