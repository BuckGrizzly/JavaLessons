public class BasicArrays2
{
	public static void main( String [] args )
	{
		int[] num = new int[10];
		
	 	for (int i = 0; i < num.length; i++)
		{
			num[i] = 1 + (int)(Math.random()*100);
			System.out.print("Slot " + i + " contains a " + num[i] + "\n");
		}
	}
}


