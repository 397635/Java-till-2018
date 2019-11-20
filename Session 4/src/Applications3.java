//Odd vs. Even
import java.util.Scanner;
public class Applications3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Give a number, and I can tell you if it is even or odd!!");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("\nThis number is even!");
		}
		else {
			System.out.println("\nThis number is odd!");
		}
		
	
	}

}
