import java.util.Scanner;

public class CountingAForLoop
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        
		doLoop(message);
		doLoop(message);
		doLoop(message);
						
    }
    
    public static void doLoop(String message) {
    	for ( int n = 5 ; n >= 1 ; n = n-1 )
        {
            System.out.println( n + ". " + message );
        }
    }
}


// import java.util.Scanner;
// 
// public class CountingFor
// {
//     public static void main( String[] args )
//     {
//         Scanner keyboard = new Scanner(System.in);
// 
//         System.out.println( "Type in a message, and I'll display it five times." );
//         System.out.print( "Message: " );
//         String message = keyboard.nextLine();
// 
//         for ( int n = 1 ; n <= 5 ; n = n+1 )
//         {
//             System.out.println( n + ". " + message );
//         }
// 
//     }
// }