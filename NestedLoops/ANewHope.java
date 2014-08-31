public class ANewHope
{
	public static void main( String[] args )
	{
		for ( int a = 1; a <= 100; a++ )
		{
			for ( int b = 1; b <= 100; b++ )
			{
				for ( int c = 1; c <= 100; c++ )
				{
					for ( int d = 1; d <= 100; d++ )
					{
						if ( a + b + c + d == 45 && ((a + 2) == (b - 2)) && ((c * 2) == (a + 2)) && ((c * 2) == (b - 2)) && ((d / 2) == (a + 2)) && ((d / 2) == (b - 2)) && ((d / 2) == (c * 2)))
						System.out.println(a + " + " + b + " + " + c + " + " + d);
					}
				}
			}
		}
	}
}







	

