//Maximum vs. Minimum
import java.util.Scanner;
public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("first number:\n");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.print("second number:\n");
		Scanner scanner1 = new Scanner(System.in);
		int secondNumber = scanner1.nextInt();
		
		
		if(firstNumber > secondNumber) {
			System.out.print("Maximum is " + firstNumber);
			System.out.print("\nMinimum is " + secondNumber);
		}
			
		else {
			System.out.print("Maximum is " + secondNumber);
			System.out.print("\nMinimum is " + firstNumber);	
		}
	}

}
