import java.util.Scanner;

public class NameAgeSalary
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		double wage;
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you?" );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not old at all!" );
		System.out.println( "How much do you make, " + name + "?" );
		wage = keyboard.nextDouble();
	
		System.out.println( wage + "! I hope that's per hour and not per year! LOL! " );
		}
}