import java.util.Scanner;

public class XsAndYs
{
	public static void main( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		double y;
		double num1, num2, num3;
		
		num1 = -10;
		num2 = 10;
		
		System.out.println( "X" + "\tY");
		System.out.println( "___" + "\t___" );
		
		for (double x = num1 ; x <= num2; x = x + 0.5)
		{
			y = x * x;
			System.out.println( x + "\t" + y);
		}
		
	}
}