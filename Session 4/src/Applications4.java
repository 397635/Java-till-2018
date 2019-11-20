//3 digit number and add those two digits
import java.util.Scanner;

public class Applications4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a 3 digit number: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		int y = x/100;
		int n = x%100/10;
		int a = x%10;
		int m = y + n + a;
		System.out.println("The sum of all the 3 digits in "+ x +" is "+ m);
		
		

	}

}
