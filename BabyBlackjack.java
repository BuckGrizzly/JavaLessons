import java.util.Scanner;
import java.util.Random;

public class BabyBlackjack
{
	public static void main( String[] args )
	{

		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int card1 = 1 + r.nextInt(10);
		int card2 = 1 + r.nextInt(10);
		int dealer_card1 = 1 + r.nextInt(10);
		int dealer_card2 = 1 + r.nextInt(10);
		int your_total = (card1 + card2);
		int dealer_total = (dealer_card1 + dealer_card2);
		
		System.out.print( "Baby Blackjack! ");
		
		
		System.out.println( "You drew " + card1 + " and " + card2 + ".");
		System.out.println( "Your total is " + your_total );
		
		System.out.println( "The dealer has " + dealer_card1 + " and " + dealer_card2 + ".");
		System.out.println( "Dealer's total is " + dealer_total );
		
		if ( your_total > dealer_total )
		{
			System.out.println( "YOU WIN!" );
		}
		else if ( your_total <= dealer_total )
		{
			System.out.println( "YOU LOSE!" );
		}
	
	
	}

}


