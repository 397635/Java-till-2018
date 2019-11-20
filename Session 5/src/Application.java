//using class person
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person ();
		person1.name = "Gauri";
		person1.age = 13;
		person1.grade = 8;
		person1.favoritecolor = "blue";
		person1.hobby = "reading";
		
		System.out.println("The person's name is " + person1.name + ", and his/her age is " + person1.age + ". The grade he/she is in is " + person1.grade + ". Also her favorite color is " + person1.favoritecolor + ", and her hobby is " + person1.hobby + "." );

		
		Person person2 = new Person ();
		person2.name = "Keshav";
		person2.age = 11;
		person2.grade = 6;
		person2.favoritecolor = "blue";
		person2.hobby = "reading";
		
		System.out.println("The person's name is " + person2.name + ", and his/her age is " + person2.age + ". The grade he/she is in is " + person2.grade + ". Also her favorite color is " + person2.favoritecolor + ", and her hobby is " + person2.hobby + "." );
	}

}
