import java.util.Scanner;

public class KeychainsForSaleForReal
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		int number;
		double price;
		
		price = 10.00;
		
		
		do
		{
		System.out.println("Ye Olde Keychain Shoppe");
		System.out.println("\n1. Add Keychains to Order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout ");
		System.out.print("\nPlease enter your choice: ");
		choice = keyboard.nextInt();
	
		System.out.print(j(choice));
		
			if ( choice == 1 )
			{
				add_keychains();
			}
			
			
		
		} while (choice != 4 );
	}



		
	public static String j(int choice)
	{
		if ( choice == 1 )
		
		
		
			return "\nADD KEYCHAINS\n";
		else if ( choice == 2 )
			return "\nREMOVE KEYCHAINS\n";
		else if ( choice == 3 )
			return "\nVIEW ORDER\n";
		else
			return "\nCHECKOUT\n";
		}
		
		
		
		add_keychains(int)
		{
		return;
		}
		
		remove_keychains(int)
		{
		return;
		}
		
		public static void view_order(int, int)
		{
		return;
		}
		
		checkout(int, int)
		{
		return;
		}
		
		
		

		
	}
	
	
}