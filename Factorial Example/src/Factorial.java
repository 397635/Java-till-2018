
public class Factorial {


	static int calculate (int number) {
			
		
		int total = 1;
		for(int i = 1 ;i<=number ;  i++ ) {
			if(i%2==0) {
			total = total * i;
			}
			
			
		}
		
		
		return total;
		
	}

}
