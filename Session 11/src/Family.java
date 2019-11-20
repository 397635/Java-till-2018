
public class Family {
	
	String lastname;
	Person daddy;
	Person mom;
	Person kid1;
	Person kid2;
	
	 boolean istoddlerexist() {
		 if (kid1.age < 5 ) {
			 System.out.println("Toddler");
			 return true;
		 }
		 else if (kid2.age < 5) {
			 System.out.println("Toddler");
			 return true; 
		 }
		 else {
			 System.out.println("Not Toddler");
			 return false;
			 
		 }
		
	 }
	 
	
	
	
	
}
