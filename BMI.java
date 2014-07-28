import java.util.Scanner;

public class BMI
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		//SAMPLE QUESTION VERSION
		
		// double bmi, height, weight;
// 				
// 		System.out.print( "Your height in m: " );
// 		height = keyboard.nextDouble();
// 		
// 		System.out.print( "Your weight in kg: " );
// 		weight = keyboard.nextDouble();
// 		
// 		bmi = weight / (height * height);
// 		
// 		System.out.println( "Your BMI is " + bmi);

		//BONUS 1 VERSION

		// double bmi, height, weight, height2, weight2;
// 				
// 		System.out.print( "Your height in inches: " );
// 		height = keyboard.nextDouble();
// 		
// 		System.out.print( "Your weight in pounds: " );
// 		weight = keyboard.nextDouble();
// 		
//         height2 = (height * 0.0254); //m
//         weight2 = (weight * 0.45); //kilos		
// 		bmi = weight2 / (height2 * height2);
// 		
// 		System.out.println( "Your BMI is " + bmi);

		//BONUS 2 VERSION test

		double bmi, height, weight, height2, weight2, heightFeet, heightInches;
				
		System.out.print( "Your height (feet only): " );
		heightFeet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches only): " );
		heightInches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		weight = keyboard.nextDouble();
		
        height2 = (((heightFeet * 12) + heightInches) * 0.0254); //m
        weight2 = (weight * 0.45); //kilos		
		bmi = weight2 / (height2 * height2);
		
		System.out.println( "Your BMI is " + bmi);

		}
}