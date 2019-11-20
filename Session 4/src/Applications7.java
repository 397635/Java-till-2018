//Fibonacci Sequence
import java.util.*;
import java.util.Scanner;
public class Applications7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// 1+1 1+2 2+3 3+4 4+5 5+6 6+7 7+8 8+9 9+10
		System.out.print("\nChoose how many numbers in the Fibonacci Sequence you want to print: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		
		int a = 0;
		int b = 1;
	
		
		for(int i = 1; i<=x ; i = i+1)
		{
		
		int	c = a+b;
		System.out.println(c);
			a=b;
	    	b=c;
		}
		}
		}
		
		
		
		
	


