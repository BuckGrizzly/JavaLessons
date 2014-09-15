public class CopyingArrays
{
	public static void main( String[] args )
	{
		int[] num = new int[10];
		int[] num2 = new int[10];
		int i;
		
		num[0] = 0;
		num[1] = 0;
		num[2] = 0;
		num[3] = 0;
		num[4] = 0;
		num[5] = 0;
		num[6] = 0;
		num[7] = 0;
		num[8] = 0;
		num[9] = 0;
		
		num[0] = 1 + (int)(Math.random()*100);
		num[1] = 1 + (int)(Math.random()*100);
		num[2] = 1 + (int)(Math.random()*100);
		num[3] = 1 + (int)(Math.random()*100);
		num[4] = 1 + (int)(Math.random()*100);
		num[5] = 1 + (int)(Math.random()*100);
		num[6] = 1 + (int)(Math.random()*100);
		num[7] = 1 + (int)(Math.random()*100);
		num[8] = 1 + (int)(Math.random()*100);
		num[9] = -7;
		System.out.print("Array 1: " + num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4] + " " + num[5] + " " + num[6] + " " + num[7] + " " + num[8] + " " + num[9] + " ");

		
		System.out.print("\nArray 2: ");
		for ( i = 0; i < num2.length; i++ )
		{
			num2[i] = 1 + (int)(Math.random()*100);
			System.out.print(num2[i] + " ");
		}
		System.out.println();
		
		

			
		
	}
}

