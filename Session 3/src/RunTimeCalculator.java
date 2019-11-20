import java.util.Scanner;
public class RunTimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Give number of laps run:\n");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.print("\nHow many minutes taken for each lap:\n");
		Scanner scanner1 = new Scanner(System.in);
		int y = scanner1.nextInt();
		
		int n = x*y;
		int m = n/60;
		int l = n%60;
		
		System.out.println("You ran " + n + " minutes total, so " + m + " hour(s) and " + l + " minutes!");
		
		/*
		Ask the user 
		Give number of laps run:
		for each run 
		ask how much time taken
		Finally print total time taken for all laps*/

	}

}
