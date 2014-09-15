public class BasicArrays3
{
	public static void main( String [] args )
	{
		int[] num = new int[1000];
		
	 	for (int i = 10; i < num.length; i++)
		{
			num[i] = 1 + (int)(Math.random()*99);
			System.out.print(num[i] + "\t");
		}
	}
}


