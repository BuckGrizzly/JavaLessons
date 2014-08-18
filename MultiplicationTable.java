public class MultiplicationTable
{
   public static void main (String[] args) {

      int result;
            
      for (int y = 1; y <= 12; y++) {
         if ( y < 10 )
         {
         	System.out.print(y + " " + "|" );
         }
         else
         {
         System.out.print(y + "|");
         }
         for (int x = 1; x <= 9; x++) {
         result = y * x;
         System.out.print( result );

            if (result < 10 )
            {
	            System.out.print("    ");
            }
            else if (result < 100 )
            {
                System.out.print( "   ");
            }
         }
         System.out.println();
      }
   } 
}