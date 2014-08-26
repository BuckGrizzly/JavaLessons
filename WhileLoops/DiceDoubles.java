import java.util.Random;

public class DiceDoubles
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int roll1, roll2, total;

		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);
		total = roll1 + roll2;

		
		System.out.println( "HERE COMES THE DICE! ");
		System.out.println( "\nRoll #1: " + roll1 );
		System.out.println( "Roll #2: " + roll2 );
		System.out.println( "The total is " + total + "!");
		
		while ( roll1 != roll2 )
		{
		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);
		total = roll1 + roll2;
		
			System.out.println( "\nRoll #1: " + roll1 );
			System.out.println( "Roll #2: " + roll2 );
			System.out.println( "The total is " + total + "!");
		}

	}
}

