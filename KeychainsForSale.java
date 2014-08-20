import java.util.Scanner;

public class KeychainsForSale
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		
		do
		{
			System.out.println("Ye Olde Keychain Shoppe");
			System.out.println("\n1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout ");
			System.out.print("\nPlease enter your choice: ");
			choice = keyboard.nextInt();
		
			if ( choice == 1 )
			{
				System.out.println("\nADD KEYCHAINS\n");
			}
			else if ( choice == 2 )
			{
				System.out.println("\nREMOVE KEYCHAINS\n");
			}
			else if ( choice == 3 )
			{
				System.out.println("\nVIEW ORDER\n");
			}
			else if ( choice == 4 )
			{
				System.out.println("\nCHECKOUT\n");
			}
		
		} while ( choice != 4 );
	}
}