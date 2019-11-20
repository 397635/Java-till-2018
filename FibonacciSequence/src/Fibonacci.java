import java.util.Scanner;

public class Fibonacci {

	void getFibonacci(int num) {

		int a = 0; 
		int b = 1;

		for (int i = 1; i <= num; i = i + 1) {

			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			
			//switches out first is 0 and 1 then switches with next becoming b and other becoming c

		}

	}
}
