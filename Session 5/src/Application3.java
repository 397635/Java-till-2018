//using class calculator
import java.util.Scanner;
public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a 2 number calculator. In this calculator, you can enter two numbers to perform operations with");
		
		System.out.print("\nEnter your first number: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.print("\nEnter your second number: ");
		Scanner scanner1 = new Scanner(System.in);
		int y = scanner1.nextInt();
		
		
		Calculator c = new Calculator(); 
	    double sum; 
	    sum = c.add(x,y);
	    System.out.println("\nThe sum of these two numbers is " + sum);
	    
	    
	    double sub;
	    sub = c.sub(x, y);
	    System.out.println("\nThe difference of these two numbers is " + sub);
	    
	    double mult;
	    mult = c.mult(x, y);
	    System.out.println("\nThe product of these two numbers is " + mult);
	    
	    double div;
	    div = c.div(x, y);
	    System.out.println("\nThe quotient of these two numbers is " + div);
		
		
		
		
		

	}

}
