import java.util.Random;

public class FortuneCookie
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		//int x = 1 + r.nextInt(54);
		
		int choice = 1 + r.nextInt(6);
		String response = "";

		if ( choice == 1 )
			response = "Fortune cookie says: \"You will find happiness with a new love.\" ";
		else if ( choice == 2 )
			response = "Fortune cookie says: \"You will eat the fridge tomorrow night.\" ";
		else if ( choice == 3 )
			response = "Fortune cookie says: \"You will do a backflip before you die.\" ";
		else if ( choice == 4 )
			response = "Fortune cookie says: \"You look silly in that hat.\" ";
		else if ( choice == 5 )
			response = "Fortune cookie says: \"You suck at math.\" ";
		else if ( choice == 6 )
			response = "Fortune cookie says: \"You drive like a maniac.\" ";
		else
			response = "Error";
			
		System.out.println( response );
			
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) );
		System.out.println();
		
	}
}
		