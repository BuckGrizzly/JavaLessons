import java.util.Scanner;

public class ChooseYourOwnAdventure
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String question1, answer1, answer2, answer3, answer4, answer5, answer6;
		
		answer1 = null;
		answer2 = null;
		answer3 = null;
		answer4 = null;
		answer5 = null;
		answer6 = null;
		
		
		System.out.println( "WELCOME TO MITCHELL's TINY ADVENTURE!");
		System.out.println( "\nYou are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"? ");
		System.out.print( "> " );
		question1 = keyboard.next();
		
		//kitchen or upstairs
		if ( question1.equals("kitchen") )
		{
			System.out.println( "\nThere is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\". ");
			System.out.print( "> " );
			answer1 = keyboard.next();
			//question1 = question1 + answer1;
		}
		else if ( question1.equals("upstairs") )
		{
			System.out.println( "\nUpstairs you see a hallway. At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway. Where would you like to go? ");
			System.out.print( "> " );
			answer2 = keyboard.next();
			//question1 = question1 + answer2;
		}
		
		
		//Select Kitchen, fridge or cabinet		
		if ( answer1 != null && answer1.equals("refrigerator") )
		{
			System.out.println( "\nInside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\") ");
			System.out.print( "> " );
			answer3 = keyboard.next();
		}
		
		else if ( answer1 != null && answer1.equals("cabinet") )
		{
			System.out.println( "\nThere's a jar of jam in there. Take it? (\"yes\" or \"no\") ");
			System.out.print( "> " );
			answer4 = keyboard.next();
		}
		
		//Select Fridge, yes or no	
		if ( answer3 != null && answer3.equals("yes") )
		{
			System.out.println( "\nYou will have a sore tummy in 30mins. ");
		}
		else if ( answer3 != null && answer3.equals("no") )
		{
			System.out.println("You die of starvation... eventually. ");	
		}
			
		//Select Cabinet, yes or no	
		if ( answer4 != null && answer4.equals("yes") )
		{
			System.out.println( "\nThief! ");
		}
		else if ( answer4 != null && answer4.equals("no") )
		{
			System.out.println("You are not a thief. ");	
		}


		
	//Select Upstairs, bedroom or bathroom
		if ( answer2 != null && answer2.equals("bedroom") )
		{
			System.out.println( "\nYou are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\") ");
			System.out.print( "> " );
			answer5 = keyboard.next();
		}
		else if ( answer2 != null && answer2.equals("bathroom") )
		{
			System.out.println( "\nYou pee. Wash your hands (\"yes\" or \"no\"). " );
			System.out.print( "> " );
			answer6 = keyboard.next();
		}
		
		//Select bedroom, yes or no
		if ( answer5 != null && answer5.equals("yes") )
		{
			System.out.println( "\nTheres a bed, you take a nap forever. ");
		}
		else if ( answer5 != null && answer5.equals("no") )
		{
			System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements. ");	
		}
	
		//Select bathroom, yes or no
		if ( answer6 != null && answer6.equals("yes") )
		{
			System.out.println( "\nYou are clean. ");
		}
		else if ( answer6 != null && answer6.equals("no") )
		{
			System.out.println("You die of dirty hands. ");	
		}
		
	}
}