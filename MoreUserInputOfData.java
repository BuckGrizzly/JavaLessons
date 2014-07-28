import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int grade, studentId;
		String firstName, surname, loginId;
		double gpa;
		
		System.out.println( "Please enter the following information so I can sell it for a profit!" );
		System.out.println (" ");
		
		System.out.print( "First name: " );
		firstName = keyboard.next();
		
		System.out.print( "Last name: " );
		surname = keyboard.next();
		
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		studentId = keyboard.nextInt();
		
		System.out.print( "Login: " );
		loginId = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0) " );
		gpa = keyboard.nextDouble();
	
		System.out.println( "Your information:" );
		System.out.println( "\t Login: " + loginId );
		System.out.println( "\t ID " + studentId  );
		System.out.println( "\t Name: " + surname + ", " + firstName );
		System.out.println( "\t GPA: " + gpa );
		System.out.println( "\t Grade: " + grade );
		
		}
}