import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		
		System.out.print( "What's your last name? " );
		name = keyboard.nextLine();
		name = name.toLowerCase();
		
		if ( name.compareTo("carswell") < 0 ) 
			System.out.print( "You don't have to wait that long, \"" + name + "\". ");

			else if ( name.compareTo("jones") < 0 )
			System.out.print( "that's not bad, \"" + name + "\". ");

			else if ( name.compareTo("smith") < 0 )
			System.out.print( "looks like a bit of a wait, \"" + name + "\". ");
			
			else if ( name.compareTo("young") < 0 )
			System.out.print( "it's gonna be a while, \"" + name + "\". ");

			else if ( name.compareTo("young") > 0 )
			System.out.print( "not going anywhere for a while, \"" + name + "\"? ");

		
	}
}