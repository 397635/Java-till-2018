//Session 3 Class

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Today is Session 3");
		int age = 13;
		//introducing variable age 
		String name = "Gauri";
		//introducing variable name 
		System.out.println("name = " +  name);
		//print what name is equal to
		System.out.println("age = " + age);
		//print what age is equal to
		
		int x = 123;
		//introducing variable x
		int y = 324;
		//introducing variable y
		int sum = x + y;
		//introducing variable sum which is variable x plus y 
		System.out.println(sum);
		//printing variable sum
		
		//boolean x -- x = true or false
		
	
		
		if(age <= 12 )  {
			System.out.println("Kid");
		}else {
			System.out.println("Not Kid");
		}
		
		if(  age > 13 && age < 20) {
			
			System.out.println("Teenager");
		}else {
			System.out.println("Not Teenager");
		}
		
		if(age >= 20 && age < 60 ) {
			
			System.out.println("Adult");
			}else {
			System.out.println("Not Adult");
		}
		
		if(age >= 60) {
			
			System.out.println("Senior");
			}else {
			System.out.println("Not Senior");
		}
		
	}

	
}
