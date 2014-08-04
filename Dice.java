import java.util.Random;
import java.util.Scanner;

public class Dice
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int roll1, roll2;
		
		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);
		
		System.out.println( "HERE COMES THE DICE! ");
		System.out.println( " " );
		System.out.println( "Roll #1: " + roll1 );
		System.out.println( "Roll #2: " + roll2 );

		System.out.println( "The total is " + (roll1 + roll2) + "!");

	}
}
