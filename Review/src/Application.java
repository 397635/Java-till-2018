
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(14, "-Bhavika");
		//p1.name = "Something Different";
		String a = p1.getInfo();
		System.out.println(a);
		p1.happyBirthday();
		String p = p1.getInfo();
		System.out.println(p);
		
		

		Person p2 = new Person(14, "-Srinidhi");
		String e = p2.getInfo();
		System.out.println(e);
		p2.happyBirthday();
		String k = p2.getInfo();
		System.out.println(k);
	

	}

}
