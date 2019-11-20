//Times Table
import java.util.*;
public class Applications5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("Enter Table Number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 1; i<=10 ;i=i+1)
		{
			int a = number * i;
			System.out.println(number + " * " +  i + " = " + a);
		}
		
	}

}
