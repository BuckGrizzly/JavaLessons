import java.util.Scanner;

public class MoreNumberPuzzles
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		do
		{
		System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
		System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
		System.out.println("3) Quit");
		System.out.print(">");
		choice = keyboard.nextInt();
		
		if (choice == 1)
		{
			optionOne();	
		}
		if (choice == 2)
		{
			optionTwo();
		}
		} while ( choice != 3 );
	}
	
	
	public static void optionOne()
	{
		for ( int i = 1; i <= 5; i++ )
		{	
			for ( int x = 0; x < 10; x++ )
			{
				if ((i * 10) + x <= 56 && (i + x) > 10)
				System.out.println( i + "" + x);
			}
			System.out.print("");
		}
	}
	
	public static void optionTwo()
	{
		for ( int i = 1; i < 10; i++ )
		{
			for ( int x = 0; x < 10; x++ )
			{
				int y = (i*10) + x;
				int z = (x*10) + i;
				if (  y - z  == i + x )
				System.out.println(y);
			}
			System.out.print(""); 
		}
	}
	
}

