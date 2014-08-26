import java.util.Scanner;

public class KeychainsForSaleForReal
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		int number = 0;
		int price;

		price = 10;
		
		System.out.println("\nYe Olde Keychain Shoppe");

		
		do
		{
		System.out.println("\n1. Add Keychains to Order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout ");
		System.out.print("\nPlease enter your choice: ");
		choice = keyboard.nextInt();
	
		System.out.print((choice));
		
			if ( choice == 1 )
			{
				number = add_keychains( number );
			}
			else if ( choice == 2 )
			{
				number = remove_keychains( number );
			}
			else if ( choice == 3 )
			{
				view_order( number, price );
			}
			else if ( choice == 4 )
			{
				checkout(number, price);
			}
		
		} while (choice != 4 );
	}
		
		
		public static int add_keychains(int keychainNum)
		{
			Scanner keyboard = new Scanner(System.in);
			int keychainAdd;
			System.out.print("You have " + keychainNum + " keychains. How many to add? ");
			keychainAdd = keyboard.nextInt();
			keychainNum += keychainAdd;
			System.out.print("You now have " + keychainNum + "keychains.\n");
		
			return keychainNum;
		}
		
		public static int remove_keychains(int keychainNum)
		{
			Scanner keyboard = new Scanner(System.in);
			int removeKeychainNum;
			System.out.print("You have " + keychainNum + " keychains. How many to remove? ");
			removeKeychainNum = keyboard.nextInt();
			keychainNum -= removeKeychainNum;
			System.out.print("You now have " + keychainNum + " keychains.\n");

			
			return keychainNum;
		}
		
		public static void view_order(int keychainNum, int price)
		{
			int c;
			c = keychainNum * price;
			
			System.out.println("You have " + keychainNum + " keychains.");
			System.out.println("Keychain cost is $" + price + " each.");
			System.out.println("Total cost is $ " + c + ".");
		}
		
		public static void checkout(int keychainNum, int price)
		{
			Scanner keyboard = new Scanner(System.in);
			int c;
			c = keychainNum * price;
			String name;
			System.out.print("What is your name? ");
			name = keyboard.next();
			System.out.println("You have " + keychainNum + " keychains.");
			System.out.println("Keychain cost is $" + price + " each.");
			System.out.println("Total cost is $" + c + " each.");
			System.out.print("Thanks for your order, " + name + "." );

		}
		
		
	
	
	
}