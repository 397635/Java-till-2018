
public class Person {
	
	private int age;
	private String name;
	
	Person(int age, String name){
		this.name=name;
		this.age=age;
	}
	
	String getInfo(){
		String a = age + name;
		return a;
	}
	
	void happyBirthday() {
		 age=age+1;
		
		
	}
	

}
