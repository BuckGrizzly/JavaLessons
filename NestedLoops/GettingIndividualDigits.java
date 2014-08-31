public class GettingIndividualDigits
{
	public static void main( String[] args )
	{
		for ( int i = 1; i < 10; i++ )
		{	
			System.out.println(i);
				
			for ( int x = 0; x < 10; x++ )
			{
				System.out.println( i + "" + x + ", " + i + "+" + x + " = " + (i+x));
			}
		}
	}
}