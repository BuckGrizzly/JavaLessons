import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double weight;
		int planet;
		
		System.out.print( "Please enter your current earth weight: ");
		weight = keyboard.nextDouble();
		
		System.out.println( " " );
		System.out.println( "I have information for the following plantes: ");
		System.out.println( "1. Venus   2. Mars    3. Jupiter ");
		System.out.println( "4. Saturn  5. Uranus  6.Neptune ");
		System.out.println( " " );
		System.out.print( "Which planet are you visiting? " );
		planet = keyboard.nextInt();
		System.out.println( " " );
		
		if ( planet == 1)
		{
			System.out.println( "Your weight would be " + weight * 0.78 + " on that planet. " );
		}
		if ( planet == 2)
		{
			System.out.println( "Your weight would be " + weight * 0.39 + " on that planet. " );
		}
		if ( planet == 3)
		{
			System.out.println( "Your weight would be " + weight * 2.65 + " on that planet. " );
		}
		if ( planet == 4)
		{
			System.out.println( "Your weight would be " + weight * 1.17 + " on that planet. " );
		}
		if ( planet == 5)
		{
			System.out.println( "Your weight would be " + weight * 1.05 + " on that planet. " );
		}
		if ( planet == 6)
		{
			System.out.println( "Your weight would be " + weight * 1.23 + " on that planet. " );
		}
		
	}

}
