public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 30;
		int dogs = 15;

		//The 'if' statement sets a condition for a Boolean expression that must be true of false.
		//The {} in the if statement makes it so all code in the body is ran, not just the first line.
		
		
		if ( people == cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
