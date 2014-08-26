import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		//While loop is similar to an if statement in that it looks for the right answer
		//and has a flow depending on if the answer is correct/incorrect.
		//While loops that are true execute all of the code in their body over and over again, 
		//if statements that are true only do it once. 
		//Because the int has already been defined and the loop will recognize this.
		//Removing that line throws an infinite loop.
		
		
		
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}