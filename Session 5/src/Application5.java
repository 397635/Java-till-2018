import java.util.Scanner;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Enter a number and I can tell you if it is odd or even!\n");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		ChkNum c1 = new ChkNum ();
		if(c1.even (x)) 
		System.out.println( x + " is even!");
		
		else {
			System.out.println( x + " is odd!");
		}
		
	
	}
	
}
