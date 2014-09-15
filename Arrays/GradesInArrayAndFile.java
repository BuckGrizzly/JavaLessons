import java.util.Scanner;

public class GradesInArrayAndFile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[] num = new int[6];
		
		System.out.print("Name (first and last): ");
		keyboard.nextLine();
		System.out.print("Filename: ");
		String fileName = keyboard.next();
		System.out.println("\nHere are your randomly-selected grades (hope you pass): ");
		
		for ( int i = 1; i < 6; i++ )
		{
		num[i] = 1 + (int)(Math.random()*100);
		System.out.println("Grade " + i + ": " + num[i]);
		}
		System.out.println("\nData saved in \"" + fileName + "\".");
	}
}