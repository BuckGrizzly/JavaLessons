import java.util.Scanner;

public class KeychainsForSaleForRealUltimatePower
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		int number = 0;
		double price;
		double tax = 8.25;
		double orderShip = 5.00;
		double additionalShip = 1.00;		

		price = 10.00;
		
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
				view_order( number, price, additionalShip, tax, orderShip );
			}
			else if ( choice == 4 )
			{
				checkout( number, price, additionalShip, tax, orderShip );
			}
			else
			{
				System.out.print("ERROR\n");
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
		
		public static void view_order(int keychainNum, double price, double additionalShip, double tax, double orderShip )
		{
			double ship = 5.00;
			double c;
			c = keychainNum * price;
			double d;
			d = keychainNum * additionalShip;
			double e;
			e = (tax / 100 * ((c + d) + ship) );
			double f;
			f = ((c + d) + e);
			
			System.out.println("You have " + keychainNum + " keychains.");
			System.out.println("Keychain cost is $" + price + " each.");
			if ( keychainNum <= 1 )
			{
				System.out.println("There is no additional shipping charge.");
				System.out.println("Subtotal cost is $ " + c + " + " + "$" + ship + " shipping.");
				System.out.println("Tax comes to $" + e + ".");
				System.out.println("The total amount of the order is $" + ((c + e) + ship) + ".");
			}
			else
			{
				System.out.println("You must pay $" + d + " in additional shipping.");
				System.out.println("Subtotal cost is $ " + (c + d) + " + " + "$" + ship + " shipping.");
				System.out.println("Tax comes to $" + e + ".");
				System.out.println("The total amount of the order is $" + (f + ship) + ".");
			}
		}
		
		public static void checkout(int keychainNum, double price, double additionalShip, double tax, double orderShip )
		{
			Scanner keyboard = new Scanner(System.in);
			double ship = 5.00;
			double c;
			c = keychainNum * price;
			double d;
			d = keychainNum * additionalShip;
			double e;
			e = (tax / 100 * ((c + d) + ship) );
			double f;
			f = ((c + d) + e);
			String name;
			System.out.print("What is your name? ");
			name = keyboard.next();
			System.out.println("You have " + keychainNum + " keychains.");
			System.out.println("Keychain cost is $" + price + " each.");
			if ( keychainNum <= 1 )
			{
				System.out.println("There is no additional shipping charge.");
				System.out.println("Subtotal cost is $ " + c + " + " + "$" + ship + " shipping.");
				System.out.println("Tax comes to $" + e + ".");
				System.out.println("The total amount of the order is $" + ((c + e) + ship) + ".");
			}
			else
			{
				System.out.println("You must pay $" + d + " in additional shipping.");
				System.out.println("Subtotal cost is $ " + (c + d) + " + " + "$" + ship + " shipping.");
				System.out.println("Tax comes to $" + e + ".");
				System.out.println("The total amount of the order is $" + (f + ship) + ".");
			}
			System.out.print("Thanks for your order, " + name + "." );

		}
		
		
	
	
	
}