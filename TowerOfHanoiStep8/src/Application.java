import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gamer g = new Gamer ();
		g.create();
		
		System.out.println("Please press any key");
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		for (;;) {
			
			System.out.println("Which tower do you want to move the disc from?");
			
			Scanner scanner1 = new Scanner(System.in);
			int x = scanner1.nextInt();
			scanner1.nextLine();
			
			System.out.println("Which tower do you wante to move the disc to?");
			
			Scanner scanner2 = new Scanner(System.in);
			int y = scanner2.nextInt();
			scanner2.nextLine();
			
			if ( x<0 || y<0) {
				break;
	//	|| is or for x/y =1
				//break; stops
			}
		
			
			
		
			
		
			}
			
		
			
		}
		
	
		
		//g.move();


	}


