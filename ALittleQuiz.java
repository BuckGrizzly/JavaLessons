import java.util.Scanner;

public class ALittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String ready;
		int answer1, answer2, answer3, correct = 0;
		
		System.out.print( "Are you ready for a quiz? ");
		ready = keyboard.next();
		
		System.out.println( " " );
		System.out.println( "Q1) What is the capital of Alaska? ");
		System.out.println( "\t 1) Melbourne ");
		System.out.println( "\t 2) Anchorage ");
		System.out.println( "\t 3) Juneau ");
		answer1 = keyboard.nextInt();
		System.out.println( " " );
		
		if ( answer1 == 3)
		{
			System.out.println( "That's right! ");
			correct = correct + 1;
		}		
		else
		{
			System.out.println( "That's wrong! ");
		}
		
		System.out.println( " " );
		System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int? ");
		System.out.println( "\t 1) Yes ");
		System.out.println( "\t 2) No ");
		answer2 = keyboard.nextInt();
		System.out.println( " " );

		if ( answer2 == 2)
		{
			System.out.println( "That's right! ");
			correct = correct + 1;
		}		
		else
		{
			System.out.println( "Sorry, \"cat\" is a string. ints can only store numbers! ");
		}
		
		System.out.println( " " );
		System.out.println( "Q3) What is the result of 9+6/3? ");
		System.out.println( "\t 1) 5 ");
		System.out.println( "\t 2) 11 ");
		System.out.println( "\t 3) 15/3 ");
		answer3 = keyboard.nextInt();
		System.out.println( " " );

		if ( answer3 == 2)
		{
			System.out.println( "That's right! ");
			correct = correct + 1;
		}		
		else
		{
			System.out.println( "That's wrong! ");
		}
		
		System.out.println( "Overall, you got " + correct + " out of 3 correct." );
		System.out.println( "Thanks for playing! ");

		
		
	}
}