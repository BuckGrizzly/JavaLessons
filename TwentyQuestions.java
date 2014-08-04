import java.util.Scanner;

public class TwentyQuestions
{
	public static void main( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		String question1, question2;
		
		
		System.out.println( "TWO QUESTIONS!");
		System.out.println( "Think of an object, and I'll try to guess it.");
		System.out.println( "\nQuestion 1) Is it animal, vegetable or mineral?");
		question1 = keyboard.next();
		
		System.out.println( "\nQuestion 2) Is it bigger than a breadbox?");
		question2 = keyboard.next();
		
		if ( question1.equals("animal") && question2.equals("yes") )
		{
			System.out.println( "My guess is that you are thinking of a moose." );
		}
		if ( question1.equals("animal") && question2.equals("no") )
		{
			System.out.println( "My guess is that you are thinking of a squirrel." );
		}
		if ( question1.equals("vegetable") && question2.equals("yes") )
		{
			System.out.println( "My guess is that you are thinking of a watermelon." );
		}
		if ( question1.equals("vegetable") && question2.equals("no") )
		{
			System.out.println( "My guess is that you are thinking of a carrot." );
		}
		if ( question1.equals("mineral") && question2.equals("yes") )
		{
			System.out.println( "My guess is that you are thinking of a camaro." );
		}
		if ( question1.equals("mineral") && question2.equals("no") )
		{
			System.out.println( "My guess is that you are thinking of a paper clip." );
		}
	
	}
}