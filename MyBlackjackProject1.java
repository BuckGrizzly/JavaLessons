import java.util.Scanner;
import java.util.Random;

public class MyBlackjackProject1
{
	public static void main( String[] args ) throws InterruptedException
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		String decision1;
		
		int player_card1 = 2 + r.nextInt(10);
		int player_card2 = 2 + r.nextInt(10);
		int dealer_card1 = 2 + r.nextInt(10);
		int dealer_card2 = 2 + r.nextInt(10);
		int player_final_total, dealer_final_total;
		int hit = 0, player_bet = 0, dealer_bet = 0;
	
		
		//Casino Graphic
		System.out.println( "***********************************************************" );
		System.out.println( "*                                                         *" );
		System.out.println( "*   CCC      AAAAA      SSS     IIIII   N           OOO   *" );
		System.out.println( "*  C   C    A     A    S   S      I     NNNNNNN    O   O  *" );
		System.out.println( "* C     C   A     A   S     S     I     N     N   O     O *" );
		System.out.println( "* C         A     A   S     S     I     N     N   O     0 *" );
		System.out.println( "* C               A   S           I     N     N   O     0 *" );
		System.out.println( "* C               A   S           I     N     N   O     0 *" );
		System.out.println( "* C         AAAAAAA    SSSS       I     N     N   O     0 *" );
		System.out.println( "* C         A     A        S      I     N     N   O     0 *" );
		System.out.println( "* C         A     A         S     I     N     N   O     0 *" );
		System.out.println( "* C         A     A   S     S     I     N     N   O     0 *" );
		System.out.println( "* C         A     A   S     S     I     N     N   O     0 *" );
		System.out.println( "* C     C   A     A   S     S     I     N     N   O     0 *" );
		System.out.println( "*  C   C    A     A    S   S      I     N     N    O   0  *" );
		System.out.println( "*   CCC      AAAAA A    SSS     IIIII   N     N     O00   *" );
		System.out.println( "*                                                         *" );
		System.out.println( "***********************************************************" );
		
		
		System.out.print( "\nPrepare to be DOMINATED by Mike's Blackjack program! \n");
		player_final_total = 0;
		dealer_final_total = 0;
	

		//Player's bet
		System.out.print( "\nThis Casino has 3/2 odds for Blackjack.\n");
		System.out.print( "How much would you like to bet? $");
		player_bet = keyboard.nextInt();
		Thread.sleep(1000);
		System.out.println( "\nYou place a $" + player_bet + " bet." );
		Thread.sleep(1000);


		//Player's starting hand
		System.out.println( "\nThe first card you draw is a " + player_card1 + ", the second card is a " + player_card2 + ".");
		int player_total = (player_card1 + player_card2);
		System.out.println( "You start off with " + player_total + ".\n");
		
		
		//Instant win on a blackjack right off the bat, or instant bust
		if ( player_total == 21 )
		{
			System.out.println( "YOU'VE ONLY GONE AND GOT A BLACKJACK!!! YOU WIN!!" );
        		System.out.println( "YOU ALSO TAKE $" + ( (player_bet*3) / 2 ) + " FROM THAT SMUG DEALER." );
			System.exit(0); 
		}
		if ( player_total == 22 )
		{
			System.out.println( "YOU BUST!! DEALER WINS!! SAD FACES ALL ROUND :(" );
       			System.out.println( "You also lose $" + player_bet + ". Talk about a kick in the teeth..." );
			System.exit(0); 
		}
		
		
		//Dealer's partial hand
		System.out.println( "The dealer flips over a card. It's a " + dealer_card1 + ". The other card remains hidden. ");
		System.out.println( "The dealer smiles at you overconfidently. Game on! \n" );
		
		
		//Hit or Stay
		System.out.print( "Would you like to \"hit\" or \"stay\"? " );
		decision1 = keyboard.next();
		
		
		//Scenario results from the player hitting
		if (decision1.equalsIgnoreCase("hit"))
		{
	        	while (player_total < 21 && decision1.equalsIgnoreCase("hit"))
	        	{
	       			if (decision1.equalsIgnoreCase("hit"))
	       			{
					hit = 2 + r.nextInt(10);
        		 		System.out.println( "You drew a " + hit + "." );
           				Thread.sleep(500);
                			player_total = player_total + hit;
                			System.out.println("Your total is " + player_total + ".\n");
                			if ( player_total == 21 )
                			{
               					player_final_total = player_final_total + player_total;
                				System.out.println( "MONEY IN THE BAG! You Stay" );
 						break;               	
                			}
                			if ( player_total > 21 )
                			{
                				System.out.println( "The gamble didn't pay off, YOU'VE BUST SUKKA!\n" );
    						System.out.println( "You also lose $" + player_bet + ". Talk about a kick in the teeth..." );
						System.exit(0); 
        	   	 		}
                			System.out.print("Would you like to \"hit\" or \"stay\"? ");
                			decision1 = keyboard.next();
                			System.out.println();
        			 }
            		}        
        	}
        
        
        	//Player final total
    		player_final_total = player_final_total + player_total;
		if ( decision1.equalsIgnoreCase("stay") )
		{
			System.out.println( "You stay with " + player_final_total + "." );
		}
		
		
		//Dealer's starting hand
 		System.out.println( "\nOkay, dealer's turn. ");
 		Thread.sleep(1000);
		System.out.println( "\nDealer's hidden card was " + dealer_card2 + "." );
		int dealer_total = (dealer_card1 + dealer_card2);
		System.out.println( "Dealer total is " + dealer_total + ".\n");
		Thread.sleep(1000);

		
 		//Dealer scenarios for < 16 hand
		if ( dealer_total < player_final_total )
		{
			while ( dealer_total <= 16 )
			{
				if ( dealer_total <= player_final_total )
				{
					System.out.println( "Dealer chooses to hit.\n" );
	 				hit = 2 + r.nextInt(10);
            				System.out.println( "Dealer draws a " + hit + ".");
            				dealer_total = dealer_total + hit;
            				System.out.println( "Dealer total is " + dealer_total + ".\n");
            				Thread.sleep(1000);
            				if ( dealer_total > 21 )
            				{
                				System.out.println( "Dealer is bust, YOU WIN!" );
                				System.out.println( "YOU ALSO TAKE $" + ( (player_bet*3) / 2 ) + " FROM THE DEALER.\n" );
						System.exit(0); 
            				}
            				if ( dealer_total == 21 )
            				{
            					System.out.println( "Dealer has 21." );
       	    					dealer_final_total = dealer_final_total + dealer_total;
						System.out.println( "Dealer Stay's with " + dealer_final_total + ".\n");
            					break;
            				}
            				if ( dealer_total <= 21 && dealer_total > player_final_total )
            				{
               					dealer_final_total = dealer_final_total + dealer_total;
						System.out.println( "Dealer Stay's with " + dealer_final_total + ".\n");
            					break;
            				}
            			}	
			}
 		}
 		
 		
 		//Dealer final total
    		dealer_final_total = dealer_final_total + dealer_total;
		if ( dealer_final_total > player_final_total && dealer_final_total < 21 )
		{
			System.out.println( "Dealer stays with " + dealer_final_total + "." );
		}
 		
 		
		//Determining who wins
		if ( player_final_total > dealer_final_total )
		{
			System.out.println( "YOU WIN!");
            		System.out.println( "YOU ALSO TAKE $" + ( (player_bet*3) / 2 ) + " FROM THAT SMUG DEALER." );
		}
		if ( dealer_final_total > player_final_total )
		{
			System.out.println( "DEALER WINS!!");
       		System.out.println( "You also lose $" + player_bet + ". Talk about a kick in the teeth..." );
		}
		if ( player_final_total == dealer_final_total )
		{
			System.out.print( "DRAW! " );
			System.out.println( "YOU KEEP $" + player_bet + ". \n" );
		}
	}	
}
