import java.util.Scanner;
import java.util.Random;

public class MyBlackjackProject2
{
    /**
     * Gets a random int from 0 - 51.
     * @return int the randomly generated number
     */
    public static int nextCard()
    {
        Random r = new Random();
        return 0 + r.nextInt(51);
    }

    /**
     * Player opts to Hit instead of Stay
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
        //player cards
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] numCard = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Card[] cards = new Card[52];

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // store the generated deck of cards in objects
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String num = numCard[deck[i] % 13];
            Card card = new Card(num, suit);
            cards[i] = card;
        }

        Scanner keyboard = new Scanner(System.in);

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


        do
        {
            Card playerCard1 = cards[nextCard()];
            Card playerCard2 = cards[nextCard()];
            Card dealerCard1 = cards[nextCard()];
            Card dealerCard2 = cards[nextCard()];
            int playerFinalTotal, dealerFinalTotal;
            int playerBet = 0;

            String decision1;

            System.out.print( "\nPrepare to be DOMINATED by Mike's Blackjack program! \n");
            playerFinalTotal = 0;
            dealerFinalTotal = 0;

            System.out.print("\nWould you like to play Blackjack? Select 1 for \"Yes\" or 2 for \"No\"? ");
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
                System.out.println("\nThe Dealer deals you two cards. They are: ");
            }
            else if ( play == 2 )
            {
                System.out.println("Thank you for visiting Mike's Casino. Enjoy your day.");
                System.exit(0);
            }

            playerCard1.printCard();
            Thread.sleep(1000);
            playerCard2.printCard();
            Thread.sleep(1000);


            int playerTotal = (playerCard1.getValue() + playerCard2.getValue());
            System.out.println( "\nYour combined total from the first deal is " + playerTotal + ".\n");

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
            System.out.println( "The Dealer flips over a card. It's a: " );
            dealerCard1.printCard();
            Thread.sleep(1000);
            System.out.println("The other card remains hidden for now. ");
            System.out.println( "The Dealer smiles at you with a look of overconfidence. Game on! \n" );


            //Hit or Stay
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            decision1 = keyboard.next();


            //Scenario results from the player hitting
            if ( youHit(decision1))
            {
                while (playerTotal < 21 && youHit(decision1))
                {
                    if (youHit(decision1))
                    {
                        Card playerHitCard = cards[nextCard()];
                        playerHitCard.printCard();
                        Thread.sleep(1000);
                        playerTotal = playerTotal + playerHitCard.getValue();
                        System.out.println("\nYour total is " + playerTotal + ".\n");

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
            System.out.println( "\nOkay, Dealer's turn. ");
            Thread.sleep(1000);
            System.out.println( "\nDealer's hidden card was " + dealerCard2.getValue() + "." );
            int dealerTotal = (dealerCard1.getValue() + dealerCard2.getValue());
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
                        Card dealerHitCard = cards[nextCard()];
                        dealerHitCard.printCard();
                        Thread.sleep(1000);
                        System.out.println( "Dealer draws a " + dealerHitCard.getValue() + ".");
                        dealerTotal = dealerTotal + dealerHitCard.getValue();
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
            dealerFinalTotal = dealerFinalTotal + dealerTotal;
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
