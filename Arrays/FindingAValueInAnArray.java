import java.util.Scanner;

public class FindingAValueInAnArray
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int value;
		int[] number = new int[10];
		boolean found;
		
		System.out.print("Array: ");
		for ( int i = 0; i < number.length; i++ )
		{
			number[i] = 1 + (int)(Math.random()*50);
			System.out.print(number[i] + " ");
		}
		System.out.print("Value to find: ");
		value = keyboard.nextInt();
		
		found = false;
		for ( int num : number )
		{
			if (value == num )
			{
				System.out.println(value + " is in the array.");
				found = true;
			}
		}
		if ( found == false )
		{
			System.out.println("Try again! " + value + " is not in the array."); 
		}
	}
}