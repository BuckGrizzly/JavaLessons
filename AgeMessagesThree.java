import java.util.Scanner;

public class AgeMessagesThree
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
	
		System.out.print( "Your name: " );
		name = keyboard.next();
		
		System.out.print( "Your age: " );
		age = keyboard.nextInt();

		if ( age < 16 )
		{	
			System.out.println( "You can't drive, " + name );
		}
		
		if ( age >= 16 && age < 18)
		{
			System.out.println( "You can drive but not vote, " + name );
		}
		
		if ( age >= 18 && age < 24)
		{
			System.out.println( "You can vote but not rent a car, " + name );
		}
		if ( age > 25 )
		{
			System.out.println( "You can pretty much do anything, " + name );
		}
	}
}