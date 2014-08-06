import java.util.Scanner;

public class CompareToChallenge
{
	public static void main( String[] args )
	{

	Scanner keyboard = new Scanner(System.in);
	String name;   	

	
	System.out.println("5 examples that return a number LESS than 0");
	System.out.print("Comparing \"axe\" with \"dog\" produces ");
	System.out.println( "axe".compareTo("dog") );
	System.out.print("Comparing \"james\" with \"sleep\" produces ");
	int j = "james".compareTo("sleep");
	System.out.println(j);
	System.out.print("Comparing \"dad\" with \"mum\" produces ");
	System.out.println( "dad".compareTo("mum") );
	System.out.print("Comparing \"brother\" with \"sister\" produces ");
	int b = "brother".compareTo("sister");
	System.out.println(b);
	System.out.print("Comparing \"aunt\" with \"uncle\" produces ");
	int a = "aunt".compareTo("uncle");
	System.out.println(a);
	
	
	System.out.println("\n5 examples that return a number GREATER than 0");
	System.out.print("Comparing \"rudolph\" with \"donna\" produces ");
	System.out.println( "rudolph".compareTo("donna") );
	System.out.print("Comparing \"chirstmas\" with \"all\" produces ");
	int c = "christmas".compareTo("all");
	System.out.println(c);
	System.out.print("Comparing \"prometheus\" with \"alien\" produces ");
	System.out.println( "prometheus".compareTo("alien") );
	System.out.print("Comparing \"yesterday\" with \"today\" produces ");
	int y = "yesterday".compareTo("today");
	System.out.println(y);
	System.out.print("Comparing \"tall\" with \"height\" produces ");
	int t = "tall".compareTo("height");
	System.out.println(t);
	
	System.out.println("\n5 examples that return a number EXACTLY 0");
	System.out.print("Comparing \"eagle\" with \"eagle\" produces ");
	System.out.println( "eagle".compareTo("eagle") );
	System.out.print("Comparing \"hawk\" with \"hawk\" produces ");
	int h = "hawk".compareTo("hawk");
	System.out.println(h);
	

	}
}


