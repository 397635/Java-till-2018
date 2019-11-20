   
public class Person {

	String name;
	int age;

	void jump() {
		System.out.println(name + " is jumping.");
	}

	Person(String inputname, int inputage) {
		name = inputname;
		age = inputage;
		System.out.println("Person constructor");
	}

	Person(String inputname) {
		name = inputname;
	}
}
