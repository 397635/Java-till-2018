import java.util.*;
public class Math {

	int tablenumber;
	int count;
			
	
	
	static int printTable(int tablenumber, int count) {
		
		for ( int i = 1; i <= count ; i = i+1) {
			
			int z = tablenumber * i;
			
			
		
	
		
		
	
		
		if  (tablenumber < 0){
			System.out.println("ERROR DO NOT GIVE NEGATIVE NUMBERS!");
			
		}else {
	
			System.out.println(tablenumber + " times" + " " + i + " equals" + " " + z);
		
		}
		
		
	}
		return 0;
		
		
		

}
}
