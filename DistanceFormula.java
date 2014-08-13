public class DistanceFormula
{
	public static void main( String[] args )
	{
		// test the formula a bit
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );
 
		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );
 
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );
 
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}
 
	public static double distance( int x1, int y1, int x2, int y2 )
	{
		// put your code up in here
		double e;
		
		e = Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
		
		return e;
	}
}
// 		a = triangleArea(3, 3, 3);
// 		System.out.println("A triangle with sides 3,3,3 has an area of " + a );
// 
// 		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
// 	}
//  
// 	public static double triangleArea( int a, int b, int c )
// 	{
// 		// the code in this function computes the area of a triangle whose sides have lengths a, b, and c
// 		double s, A;
// 
// 		s = (a+b+c) / 2.0;
// 		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
// 
// 		return A;
// 		// ^ after computing the area, "return" it