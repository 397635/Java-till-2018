import java.util.*;
public class Application {
	
	public static void main(String[]args){
		System.out.println("Please enter a number");

		Scanner scanner = new Scanner(System.in) ;
				int x = scanner.nextInt();
		
	switch(x){
	case 1:
		System.out.println("You are a champion");
		break;
	case 2:
		System.out.println("You are the runner-up");
		break;
	case 3: 
		System.out.println("Better luck next time");
		break;
	default:
		System.out.println("You are a failure");
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in) ;
			int x = scanner.nextInt();
			if (x==1) {
				System.out.println("You are a champion");
				
			}else if(x==2) {
				System.out.println("You are the runner-up");
				
			}else if(x==3) {
				System.out.println("Better luck next time");
				
			}else {
				System.out.println("You are a failure");
			}
		}

	}*/
}


}