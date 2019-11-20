
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Family f1 = new Family();
		f1.lastname = "Arora";
		
		f1.daddy = new Person();
		f1.daddy.age = 41;
		f1.daddy.name = "Arvind";
		
		f1.mom = new Person();
		f1.mom.age = 37;
		f1.mom.name = "Shalika";
		
		f1.kid1 = new Person();
		f1.kid1.age = 13;
		f1.kid1.name = "Gauri";
		
		f1.kid2 = new Person ();
		f1.kid2.age = 11;
		f1.kid2.name = "Keshav";

		boolean toddler = f1.istoddlerexist();

	}

}
