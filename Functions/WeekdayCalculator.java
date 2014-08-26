import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		
		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total = 0;
		String date = "";

		// bunch of calculations go here
		yy = yyyy - 1900;
		total = (yy / 4) + yy + dd + monthOffset(mm);

		date = weekdayName(total%7) + "," + monthName(mm) + ", " + dd + "," + yyyy;
		

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	
		public static String monthName( int month )
		{
		String monthName = "error";
		
		if ( month == 1 )
			monthName = "January";
		else if ( month == 2 )
			monthName = "February";
		else if ( month == 3 )
			monthName = "March";
		else if ( month == 4 )
			monthName = "April";
		else if ( month == 5 )
			monthName = "May";
		else if ( month == 6 )
			monthName = "June";
		else if ( month == 7 )
			monthName = "July";
		else if ( month == 8 )
			monthName = "August";
		else if ( month == 9 )
			monthName = "September";
		else if ( month == 10 )
			monthName = "October";
		else if ( month == 11 )
			monthName = "November";
		else if ( month == 12 )
			monthName = "December";
		
		return monthName;
	}
	
		public static String weekdayName( int weekday )
		{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 )
		{
			result = "Saturday";
		}
		else if ( weekday == 0 )
		{
			result = "Saturday";
		}
		else
		{
			result = "error";
		}
		
		
		return result;
	}

	
	public static int monthOffset( int month )
	{
	
	int monthOffset = -1;
	
	if ( month == 1)
		monthOffset = 1;
	else if ( month == 2)
		monthOffset = 4;
	else if ( month == 3)
		monthOffset = 4;
	else if ( month == 4)
		monthOffset = 0;
	else if ( month == 5)
		monthOffset = 2;
	else if ( month == 6)
		monthOffset = 5;
	else if ( month == 7)
		monthOffset = 0;
	else if ( month == 8)
		monthOffset = 3;
	else if ( month == 9)
		monthOffset = 6;
	else if ( month == 10)
		monthOffset = 1;
	else if ( month == 11)
		monthOffset = 4;
	else if ( month == 12)
		monthOffset = 6;
		
	
	return monthOffset;
	
	}
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
