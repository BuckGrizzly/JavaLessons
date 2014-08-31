public class ArmstrongNumbers
{
	public static void main( String[] args )
	{
		armstrong();
	}
	
	public static void armstrong()
	{
		for ( int i = 1; i <=9; i++ )
		{
			for ( int j = 0; j <= 10; j++ )
			{
				for ( int k = 0; k <= 10; k++ )
				{
				int q = (i * i) * i;
				int w = (j * j) * j;
				int e = (k * k) * k;				
				if ( q + w + e == ( (i * 100) + (j * 10) + k) )
				System.out.println(i + "cubed" + " + " + j + "cubed" + " + " + k + "cubed = " + ( (i * 100) + (j * 10) + k));
				}
			}
		}
	} 
}