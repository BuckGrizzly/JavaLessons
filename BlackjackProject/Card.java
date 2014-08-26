
/**
 * Created by mjenniso on 8/19/14.
 */
public class Card {
        private String number;
        private String suit;

        public Card(String number, String suit) {
            this.number = number;
            this.suit = suit;
        }

        // "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
        public int getValue() {
            switch (this.number) {
                case "A":
                    return 11;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                case "6":
                    return 6;
                case "7":
                    return 7;
                case "8":
                    return 8;
                case "9":
                    return 9;
                case "10":
                    return 10;
                case "J":
                    return 10;
                case "Q":
                    return 10;
                case "K":
                    return 10;
                default:
                    return -1; // error flag
            }
        }

        public void printCard() {
            //System.out.println( rank + " of " + suit);

            String num = this.number;
            String suit = this.suit;

            if (num.equals("10")) {
                System.out.println("************* ");
                System.out.println("* " + num + "        *");
            } else {
                System.out.println("************* ");
                System.out.println("* " + num + "         *");
            }
            if (suit.equals("Spades")) {
                System.out.println("*           * ");
                System.out.println("*     *     * ");
                System.out.println("*    ***    * ");
                System.out.println("*   *****   * ");
                System.out.println("*  *******  * ");
                System.out.println("*   *****   * ");
                System.out.println("*     *     * ");
                System.out.println("*   *****   * ");
                System.out.println("*           * ");
            } else if (suit.equals("Hearts")) {
                System.out.println("*           * ");
                System.out.println("*  **   **  * ");
                System.out.println("* **** **** * ");
                System.out.println("* ********* * ");
                System.out.println("*  *******  * ");
                System.out.println("*   *****   * ");
                System.out.println("*    ***    * ");
                System.out.println("*     *     * ");
                System.out.println("*           * ");
            } else if (suit.equals("Diamonds")) {
                System.out.println("*           * ");
                System.out.println("*     *     * ");
                System.out.println("*    ***    * ");
                System.out.println("*  *******  * ");
                System.out.println("* ********* * ");
                System.out.println("*  *******  * ");
                System.out.println("*    ***    * ");
                System.out.println("*     *     * ");
                System.out.println("*           * ");
            } else if (suit.equals("Clubs")) {
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
            if (num.equals("10")) {
                System.out.println("*        " + num + " *");
                System.out.println("************* ");
            } else {
                System.out.println("*         " + num + " *");
                System.out.println("************* ");
            }
        }


}
