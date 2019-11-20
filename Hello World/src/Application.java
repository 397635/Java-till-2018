import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date d = new java.util.Date();
		d.toString();
		
		
		System.out.println("Hello World "+ d);
		int number = 7;
	
		for(int i = 1; i<=10 ;i=i+1)
		{
			int a = number * i;
			System.out.println(number + " * " +  i + " = " + a);
		}
		
		MathTable m = new MathTable (8);
		MathTable m1 = new MathTable (9);
		
		System.out.print("Enter Table Number: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for(int i = 1; i<=10 ;i=i+1)
		{
			int a = x * i;
			System.out.println(x + " * " +  i + " = " + a);
		}
		
	}
		
		

	}


