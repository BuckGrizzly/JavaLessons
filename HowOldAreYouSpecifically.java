import java.util.Scanner;

public class HowOldAreYouSpecifically
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print( "Hey, what's your name? (Sorry, I keep forgetting.) ");
		name = keyboard.next();
		
		System.out.print( "OK, " + name + ", how old are you? ");
		age = keyboard.nextInt();
		
		if ( age < 16 )
		{	
			System.out.println( "You can't drive, " + name );
		}
		
		else if ( age >= 16 && age < 18)
		{
			System.out.println( "You can drive but not vote, " + name );
		}
		
		else if ( age >= 18 && age < 24)
		{
			System.out.println( "You can vote but not rent a car, " + name );
		}
		else 
		{
			System.out.println( "You can pretty much do anything, " + name );
		}
	}
}