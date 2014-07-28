import java.util.Scanner;

public class TheForgetfulMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number1, number2;
		String word1, word2;
		
		System.out.print( "Give me a word! " );
		word1 = keyboard.next();
		
		System.out.print( "Give me a second word! " );
		word2 = keyboard.next();
		
		System.out.print( "Great, now your favourite number? " );
		number1 = keyboard.nextInt();

		System.out.print( "And your second favourite number... " );
		number2 = keyboard.nextInt();
	
		System.out.println( "Whew! Wasn't that fun? " );
		}
}