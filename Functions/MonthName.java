public class MonthName
{
	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
	
	public static String month_name( int month )
	{
		String month_name = "error";
		
		if ( month == 1 )
			month_name = "January";
		else if ( month == 2 )
			month_name = "February";
		else if ( month == 3 )
			month_name = "March";
		else if ( month == 4 )
			month_name = "April";
		else if ( month == 5 )
			month_name = "May";
		else if ( month == 6 )
			month_name = "June";
		else if ( month == 7 )
			month_name = "July";
		else if ( month == 8 )
			month_name = "August";
		else if ( month == 9 )
			month_name = "September";
		else if ( month == 10 )
			month_name = "October";
		else if ( month == 11 )
			month_name = "November";
		else if ( month == 12 )
			month_name = "December";
		
		return month_name;
	}
}