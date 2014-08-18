
import java.util.Scanner;
import java.util.Random;

public class MyBlackjackProject2
{
    /**
     * Gets a random int from 2 - 12.
     * @return int the randomly generated number
     */
    public static int nextCard()
    {
        Random r = new Random();
        return 2 + r.nextInt(10);
    }
    /**
     * Player opts to Hit instead of Stay
     *
     */
    public static boolean youHit(String hit)
    {
        return hit.equalsIgnoreCase("hit");
    }

    /**
     * Blackjack or Bust
     */
    public static int checkForWin(int currentTotal, boolean isPlayer, int playerBet, int finalTotal)
    {
        if (currentTotal > 21)
        {
            if (isPlayer)
            {
                System.out.println( "The gamble didn't pay off, YOU'VE BUST!\n" );
                System.out.println( "You also lose $" + playerBet + ". Talk about a kick in the teeth..." );
            }
            else
            {
                System.out.println( "Dealer is bust, YOU WIN!" );
                System.out.println( "YOU ALSO TAKE $" + ( (playerBet*3) / 2 ) + " FROM THE DEALER.\n" );
            }
            System.exit(0);
        }
        if (currentTotal == 21)
        {
            finalTotal = finalTotal + currentTotal;
            if (isPlayer)
            {
                System.out.println( "MONEY IN THE BAG! You Stay" );
            }
            else
            {
                System.out.println( "Dealer has 21." );
                System.out.println( "Dealer Stay's with " + finalTotal + ".\n");
            }
        }
        return finalTotal;
    }

    public static void main( String[] args ) throws InterruptedException
    {
        Scanner keyboard = new Scanner(System.in);

        String decision1;

        int playerCard1 = nextCard();
        int playerCard2 = nextCard();
        int dealerCard1 = nextCard();
        int dealerCard2 = nextCard();
        int playerFinalTotal, dealerFinalTotal;
        int hit = 0, playerBet = 0;
        int play;

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
        playerFinalTotal = 0;
        dealerFinalTotal = 0;

        do
        {
            System.out.print("Would you like to play Blackjack? Select 1 for \"Yes\" or 2 for \"No\"? ");
            play = keyboard.nextInt();

            if (play == 1)
            {
                //Player's bet
                System.out.print("\nThis Casino has 3/2 odds for Blackjack.\n");
                System.out.print("How much would you like to bet? $");
                playerBet = keyboard.nextInt();
                Thread.sleep(1000);
                System.out.println("\nYou place a $" + playerBet + " bet.");
                Thread.sleep(1000);
            }
            else if ( play == 2 )
            {
                System.out.println("Thank you for visiting Mike's Casino. Enjoy your day.");
                System.exit(0);
            }

		//player cards
		int[] deck = new int[52];
    		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    		String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

	    // Initialize cards
    	for (int i = 0; i < deck.length; i++) {
      		deck[i] = i;
    	}

	    // Display the all the cards
   		for (int i = 0; i < 2; i++) {
			String suit = suits[deck[i] / 13];
      		String rank = ranks[deck[i] % 13];
      	//System.out.println( rank + " of " + suit);
      	if ( rank.equals("10") )
      	{
    	   	System.out.println("************* ");
      		System.out.println("* " + rank + "        *");
      	}
      	else
      	{
      		System.out.println("************* ");
      		System.out.println("* " + rank + "         *");
      	}
      	if ( suit.equals("Spades"))
      	{
			System.out.println("*           * ");
			System.out.println("*     *     * ");
			System.out.println("*    ***    * ");
			System.out.println("*   *****   * ");
			System.out.println("*  *******  * ");
			System.out.println("*   *****   * ");
			System.out.println("*     *     * ");
			System.out.println("*   *****   * ");
			System.out.println("*           * ");
      	}
      	else if ( suit.equals("Hearts"))
      	{
			System.out.println("*           * ");
			System.out.println("*  **   **  * ");
			System.out.println("* **** **** * ");
			System.out.println("* ********* * ");
			System.out.println("*  *******  * ");
			System.out.println("*   *****   * ");
			System.out.println("*    ***    * ");
			System.out.println("*     *     * ");
			System.out.println("*           * ");
      	}
      	else if ( suit.equals("Diamonds"))
      	{
			System.out.println("*           * ");
			System.out.println("*     *     * ");
			System.out.println("*    ***    * ");
			System.out.println("*  *******  * ");
			System.out.println("* ********* * ");
			System.out.println("*  *******  * ");
			System.out.println("*    ***    * ");
			System.out.println("*     *     * ");
			System.out.println("*           * ");
    	}
      	else if ( suit.equals("Clubs"))
      	{
			System.out.println("*           * ");
			System.out.println("*   *****   * ");
			System.out.println("*   *****   * ");
			System.out.println("* ********* * ");
			System.out.println("* ********* * ");
			System.out.println("*     *     * ");
			System.out.println("*    ***    * ");
			System.out.println("*  *******  * ");
			System.out.println("*           * ");
    	}
    	if ( rank.equals("10") )
    	{
    		System.out.println("*        " + rank + " *");
			System.out.println("************* ");
    	}
    	else
    	{
			System.out.println("*         " + rank + " *");
			System.out.println("************* ");
      	}
    	}











//             //Player's starting hand
//             System.out.println( "\nThe first card you draw is a " + playerCard1 + ", the second card is a " + playerCard2 + ".");
//             int pc1 = playerCard1;
//             int pc2 = playerCard2;
//             if ( pc1 < 10 && pc2 < 10)
//             {
//                 System.out.println("************* " + "\t************* ");
//                 System.out.println("* " + pc1 + "         * " + "\t* " + pc2 + "         *");
// 
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*    ***    * " + "\t*    ***    * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*  *******  * " + "\t*  *******  * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
// 
//                 System.out.println("*         " + pc1 + " *" + "\t*         " + pc2 + " *");
//                 System.out.println("************* " + "\t************* ");
//             }
//             else if ( pc1 > 10 && pc2 < 10 )
//             {
//                 System.out.println("************* " + "\t************* ");
//                 System.out.println("* " + pc1 + "        * " + "\t* " + pc2 + "         *");
// 
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*    ***    * " + "\t*    ***    * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*  *******  * " + "\t*  *******  * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
// 
//                 System.out.println("*         " + pc1 + "*" + "\t*         " + pc2 + " *");
//                 System.out.println("************* " + "\t************* ");
//             }
//             else if ( pc1 < 10 && pc2 > 10)
//             {
//                 System.out.println("************* " + "\t************* ");
//                 System.out.println("* " + pc1 + "         * " + "\t* " + pc2 + "        *");
// 
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*    ***    * " + "\t*    ***    * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*  *******  * " + "\t*  *******  * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
// 
//                 System.out.println("*         " + pc1 + " *" + "\t*         " + pc2 + "*");
//                 System.out.println("************* " + "\t************* ");
//             }
//             else if ( pc1 > 10 && pc2 > 10)
//             {
//                 System.out.println("************* " + "\t************* ");
//                 System.out.println("* " + pc1 + "        * " + "\t* " + pc2 + "        *");
// 
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*    ***    * " + "\t*    ***    * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*  *******  * " + "\t*  *******  * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
//                 System.out.println("*     *     * " + "\t*     *     * ");
//                 System.out.println("*   *****   * " + "\t*   *****   * ");
// 
//                 System.out.println("*         " + pc1 + "*" + "\t*         " + pc2 + "*");
//                 System.out.println("************* " + "\t************* ");
//             }

            int playerTotal = (playerCard1 + playerCard2);
            System.out.println( "\nYou start off with " + playerTotal + ".\n");

            //Instant win on a blackjack right off the bat, or instant bust
            if ( playerTotal == 21 )
            {
                System.out.println( "YOU'VE ONLY GONE AND GOT A BLACKJACK!!! YOU WIN!!" );
                System.out.println( "YOU ALSO TAKE $" + ( (playerBet*3) / 2 ) + " FROM THAT SMUG DEALER." );
                System.exit(0);
            }
            if ( playerTotal == 22 )
            {
                System.out.println( "YOU BUST!! DEALER WINS!! SAD FACES ALL ROUND :(" );
                System.out.println( "You also lose $" + playerBet + ". Talk about a kick in the teeth..." );
                System.exit(0);
            }

            //Dealer's partial hand
            System.out.println( "The dealer flips over a card. It's a " + dealerCard1 + ". The other card remains hidden. ");
            System.out.println( "The dealer smiles at you overconfidently. Game on! \n" );


            //Hit or Stay
            System.out.print( "Would you like to \"hit\" or \"stay\"? " );
            decision1 = keyboard.next();


            //Scenario results from the player hitting
            if ( youHit(decision1))
            {
                while (playerTotal < 21 && youHit(decision1))
                {
                    if (youHit(decision1))
                    {
                        hit = nextCard();
                        System.out.println( "You drew a " + hit + "." );
                        Thread.sleep(500);
                        playerTotal = playerTotal + hit;
                        System.out.println("Your total is " + playerTotal + ".\n");

                        playerFinalTotal = checkForWin(playerTotal, true, playerBet, playerFinalTotal);
                        System.out.print("Would you like to \"hit\" or \"stay\"? ");
                        decision1 = keyboard.next();
                        System.out.println();
                    }
                }
            }
            //Player final total
            playerFinalTotal = playerFinalTotal + playerTotal;
            if ( decision1.equalsIgnoreCase("stay") )
            {
                System.out.println( "You stay with " + playerFinalTotal + "." );
            }


            //Dealer's starting hand
            System.out.println( "\nOkay, dealer's turn. ");
            Thread.sleep(1000);
            System.out.println( "\nDealer's hidden card was " + dealerCard2 + "." );
            int dealerTotal = (dealerCard1 + dealerCard2);
            System.out.println( "Dealer total is " + dealerTotal + ".\n");
            Thread.sleep(1000);


            //Dealer scenarios for < 16 hand
            if ( dealerTotal < playerFinalTotal )
            {
                while ( dealerTotal <= 16 )
                {
                    if ( dealerTotal <= playerFinalTotal )
                    {
                        System.out.println( "Dealer chooses to hit.\n" );
                        hit = nextCard();
                        System.out.println( "Dealer draws a " + hit + ".");
                        dealerTotal = dealerTotal + hit;
                        System.out.println( "Dealer total is " + dealerTotal + ".\n");
                        Thread.sleep(1000);
                        dealerFinalTotal = checkForWin(dealerTotal, false, playerBet, dealerFinalTotal);
                        if ( dealerTotal <= 21 && dealerTotal > playerFinalTotal )
                        {
                            dealerFinalTotal = dealerFinalTotal + dealerTotal;
                            System.out.println( "Dealer Stay's with " + dealerFinalTotal + ".\n");
                            break;
                        }
                    }
                }
            }

            //Dealer final total
            dealerFinalTotal = playerFinalTotal + dealerTotal;
            if ( dealerFinalTotal > playerFinalTotal && dealerFinalTotal < 21 )
            {
                System.out.println( "Dealer stays with " + dealerFinalTotal + "." );
            }

            //Determining who wins
            if ( playerFinalTotal > dealerFinalTotal )
            {
                System.out.println( "YOU WIN!");
                System.out.println( "YOU ALSO TAKE $" + ( (playerBet*3) / 2 ) + " FROM THAT SMUG DEALER." );
            }
            if ( dealerFinalTotal > playerFinalTotal )
            {
                System.out.println( "DEALER WINS!!");
                System.out.println( "You also lose $" + playerBet + ". Talk about a kick in the teeth..." );
            }
            if ( playerFinalTotal == dealerFinalTotal )
            {
                System.out.print( "DRAW! " );
                System.out.println( "YOU KEEP $" + playerBet + ". \n" );
            }

        } while ( play != 2 );

    }
}
