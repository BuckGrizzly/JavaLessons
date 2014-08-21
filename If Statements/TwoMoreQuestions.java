import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String question1, question2;
		
		
		System.out.println( "TWO MORE QUESTIONS, BABY!");
		System.out.println( "Think of an something and I'll try to guess it.");
		System.out.print( "\nQuestion 1) Does it stay inside or outside or both?");
		question1 = keyboard.next();
		
		System.out.print( "\nQuestion 2) Is it a living thing?");
		question2 = keyboard.next();
		
		if ( question1.equals("outside") && question2.equals("yes") )
		{
			System.out.println( "Then what else could you be thinking of besides a bison?!" );
		}
		if ( question1.equals("outside") && question2.equals("no") )
		{
			System.out.println( "Then what else could you be thinking of besides a billboard?!" );
		}
		if ( question1.equals("inside") && question2.equals("yes") )
		{
			System.out.println( "Then what else could you be thinking of besides a houseplant?!" );
		}
		if ( question1.equals("inside") && question2.equals("no") )
		{
			System.out.println( "Then what else could you be thinking of besides a shower curtain?!" );
		}
		if ( question1.equals("both") && question2.equals("yes") )
		{
			System.out.println( "Then what else could you be thinking of besides a dog?!" );
		}
		if ( question1.equals("both") && question2.equals("no") )
		{
			System.out.println( "Then what else could you be thinking of besides a cell phone?!" );
		}
	
	}
}