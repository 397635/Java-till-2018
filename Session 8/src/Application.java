
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student ();
		s1.age = 13;
		s1.grade = 8;
		s1.name = "Gauri";
		s1.schoolname = "Meadow Park Middle School";
		s1.readbook();
		String bookname = "11 --  ";
		int minutes = 30;
		String print = "  minutes to read";
		s1.readbook(bookname , minutes , print);

		int x = s1.dohomework();
		System.out.println(x);
	
		
		System.out.println("The student, " + s1.name + ", is a " + s1.age + " year old at " + s1.schoolname + ", and is in " + s1.grade + " grade.");
		
		Student s2 = new Student ();
		s2.age = 11;
		s2.grade = 6;
		s2.name = "Keshav";
		s2.schoolname = "Meadow Park Middle School";
		s2.readbook();
		String bookname2 = "Island of Fire -- ";
		int minutes1 = 60;
		String print1 = " minutes to read";
		s2.readbook(bookname2 , minutes1 , print );
		int y = s2.dohomework();
		System.out.println(y);
		
		System.out.println("The student, " + s2.name + ", is a " + s2.age + " year old at " + s2.schoolname + ", and is in " + s2.grade + " grade.");

	
		Car car1 = new Car();

		car1.brand = "Toyota";
		car1.model = "RAV4";
		car1.start();
		car1.stop();
		
		
		Car car2 = new Car();

		car2.brand = "Toyota";
		car2.model = "Corolla";
		car2.start();
		car2.stop();

	
	
	}
	
	

}
