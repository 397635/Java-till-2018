//Input 2 numbers and all operations are printed
import java.util.Scanner;

public class InputOperations {
	public static void main(String[] args) {
		System.out.print("first number:\n");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextInt();
		
		System.out.print("second number:\n");
		double y = scanner.nextInt();
		
		double sum = x+y;
		System.out.println("The sum of x and y is \n" + sum);
		
		double diff = x - y;
		System.out.println("The difference of x and y is \n" + diff);
		
		double product = x*y;
		System.out.println("The product of x and y is \n" + product);
		
		
		double division = x/y;
		System.out.println("The quotient of x and y is \n" + division);
	}

}
