import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";
		
		System.out.println( "Mike's New Adventure Game: Part 2");
		

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in the living room watching TV, but are sleepy. "
								   +"Do you want to go \"upstairs\" and go to bed or "
								   +"go to the \"basement\" and play video games." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("upstairs") )
					nextroom = 2;
				else if ( choice.equals("basement") )
					nextroom = 3;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "With sleepy eyes, you venture upstairs. " 
								   +"Do you go to the \"bedroom\" and go to sleep or "
								   +"go \"back\" to the living room and watch a film? ");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("bedroom") )
					nextroom = 4;
				else if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "You go downstairs to the basement and turn on the PS4. " 
								   +"Do you put in \"fifa14\" and play some footy or "
								   +"go \"back\" to the living room and watch a film? ");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("fifa14") )
					nextroom = 5 ;
				else if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "You sleepily open the bedroom door and gaze at your bed. " 
								   +"It's calling your name. Do you \"jump\" on it superman style "
								   +"or admit its too far away and fall asleep on the \"floor\"? ");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("jump") )
					nextroom = 8;
				else if ( choice.equals("floor") )
					nextroom = 9;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 5 )
			{
				System.out.println( "Would you rather play a \"season\" or destroy some chump \"online\"? ");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("season") )
					nextroom = 6;
				else if ( choice.equals("online") )
					nextroom = 7;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 6 )
			{
					System.out.println( "Rock that league!" );
					nextroom = 0;
			}
			if ( nextroom == 7 )
			{
					System.out.println( "Smash that chump 5-0!"); 
					nextroom = 0;
			}
			if ( nextroom == 8 )
			{
				System.out.println( "Fall asleep \"with\" or \"without\" clothes on? ");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("with") )
					nextroom = 10;
				else if ( choice.equals("without") )
					nextroom = 11;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 9 )
			{
				System.out.println( "You crash on the floor. Use a \"shoe\" as a pillow or pass out \"cold\"? ");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("shoe") )
					nextroom = 12;
				else if ( choice.equals("cold") )
					nextroom = 13;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 10 )
			{
				System.out.println( "Champion!" );
				nextroom = 0;
			}
			if ( nextroom == 11 )
			{
				System.out.println( "Living the dream!"); 
				nextroom = 0;
			}
			if ( nextroom == 12 )
			{
				System.out.println( "Smelly!" );
				nextroom = 0;
			}
			if ( nextroom == 13 )
			{
				System.out.println( "You'll wake up with a stiff neck!"); 
				nextroom = 0;

			}
			
		}

		System.out.println( "\nEND." );
	}
	
}
