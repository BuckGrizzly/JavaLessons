import java.util.Scanner;

public class AreaCalculator
{
	public static void main( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		int shape;
		double area = 0;
		
		do
		{
		
			System.out.println( "Shape Area Calculator version 0.1 (c) 2013 Mitchell Sample Output, Inc." );
			System.out.println("\n_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\n");
			System.out.println("\n1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("Which shape: ");
			shape = keyboard.nextInt();
		
			if ( shape == 1 )
			{
				System.out.print("\nBase: ");
				int base = keyboard.nextInt();	
				System.out.print("\nHeight: ");
				int height = keyboard.nextInt();
				area = areaTriangle(base, height);
				System.out.println("\nThe area is " + area + ".");
			}
			else if ( shape == 2 )
			{
				System.out.print("\nLength: ");
				int length = keyboard.nextInt();
				System.out.print("\nWidth: ");
				int width = keyboard.nextInt();	
				area = 	areaRectangle(length, width);
				System.out.println("\nThe area is " + area + ".");
			}
			else if ( shape == 3 )
			{
				System.out.print("\nSide Length: ");
				int side = keyboard.nextInt();
				area = areaSquare(side);
				System.out.println("\nThe area is " + area + ".");
			}
			else if ( shape == 4 )
			{
				System.out.print("\nRadius: ");
				int radius = keyboard.nextInt();
				area = areaCircle(radius);
				System.out.println("\nThe area is " + area + ".");
			}	
			else if ( shape == 5 )
			{
				System.out.println("Goodbye");
			}
		} while ( shape != 5 );
		
	}


	
	public static double areaCircle( int radius )
	{
		double ac;
		
		ac = Math.PI * radius * radius;
		
		return ac;
	}
	public static int areaRectangle( int length, int width )
	{
		int ar;
		
		ar = length * width;
		
		return ar;
	}
	public static int areaSquare( int side )
	{
		int as;
		
		as = side * side;
		
		return as;
	}
	public static double areaTriangle( int base, int height )
	{
		double at;
	
		at = 0.5 * base * height; 
	
		return at;
	}
	
	

}