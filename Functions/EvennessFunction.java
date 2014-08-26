public class EvennessFunction
{
	public static void main( String[] args )
	{
		for ( int i = 1; i <= 20; i++ )
		{
					
			if (isEven(i))
			{
				System.out.print( i + "<\n" );
			}
			else if ( isDivisibleBy3(i) )
			{
				System.out.print( i + "=\n" );
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isEven( int n )
	{
		return (n % 2 == 0);
	}
	public static boolean isDivisibleBy3( int n )	
	{
		return (n % 3 == 0);
	}
}