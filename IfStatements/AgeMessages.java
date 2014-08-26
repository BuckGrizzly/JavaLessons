import java.util.Scanner;

public class AgeMessages
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		
		if ( age < 13)
		{
		System.out.println( "You are too young to create a Facebook account! " );
		}
		
		if ( age >= 13)
		{
		System.out.println( "You are old enough for a Facebook account! ");
		}
		
		if ( age < 16)
		{
		System.out.println( "You are too young to get a drivers license! " );
		}
		
		if ( age >= 16)
		{
		System.out.println( "You are old enough for a drivers license! ");
		}
		
		if ( age < 18)
		{
		System.out.println( "You are too young to get a tattoo! " );
		}
		
		if ( age >= 18)
		{
		System.out.println( "You are old enough for a tattoo! ");
		}
		
		if ( age < 21)
		{
		System.out.println( "You are too young to drink! " );
		}
		
		if ( age >= 21)
		{
		System.out.println( "You are old enough to drink...CHEERS!! ");
		}
		
		if ( age < 35)
		{
		System.out.println( "You are too young to run for President of the United States! " );
		System.out.println( "How sad!");
		}
		
		if ( age >= 35)
		{
		System.out.println( "You are old enough to run for President! ");
		}
		
		if (age >= 65)
		{
		System.out.println( "You are old enough to retire! " );
		}
	
	}

}