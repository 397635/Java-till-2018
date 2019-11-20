
public class Student {
	String name;
	int grade;
	int age;
	String schoolname;
	
	void readbook() {
		
		System.out.println("Read Harry Potter for 10 minutes");
		
	}
	
	void readbook (String bookname , int minutes , String print) {
		
		System.out.println (bookname + minutes + print);
		
	}
	
	int dohomework () {
		int hwmin = 20;
		System.out.println("Number of minutes done:");
		return hwmin;
		
		
	}
	
	

}
