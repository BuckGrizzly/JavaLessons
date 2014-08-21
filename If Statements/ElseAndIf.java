public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		
		//else and else if statements are there in case there is more than a 
		//simple true/false answer. Maybe there are more cars than people, maybe there
		//are more people than cars, but what if there are the same amount of people
		//as cars?
		
		//Removing the else statement doesn't affect anything because the integer values
		//are such that there will always be a true or false answer. If the answer is not
		//in the if statement, its in the else if statement, so the flow stops there.
			

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
// 		else
// 		{
// 			System.out.println( "We can't decide." );
// 		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}