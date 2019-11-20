//SchoolTypeApp
import java.util.Scanner;

public class Applications8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter what grade you are currently in(or going to): \n");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		
		if (x <= 5 && x >= 1) {
			
				System.out.println("You are in Elementary School");
			}
		
			
		else {
			System.out.println("You are not in Elementary School");
	}

		
		if (x <= 8 && x >= 6){
			
				System.out.println("You are in Middle School");
				
			
		}
		
		else {
			System.out.println("You are not in Middle School");	
			
		}
			
		if (x <= 12 && x >= 9){
			
				System.out.println("You are in High School");
				
			
		}
		
		else {
			System.out.println("You are not in High School");	
			
		}
				
			
			if (x > 12) {
				System.out.println("You are in College or Work");
			}
			
			if (x < 1) {
				System.out.println("You are in Kindergarten or Preschool");
			}
		
}
}
