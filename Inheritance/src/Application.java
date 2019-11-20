
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.speak();
		Dog d = new Dog ();
		d.speak();
		Cat c = new Cat();
		c.speak();
		Animal z = Zookeeper.getAnimal(1);
		z.speak();
		Animal z2 = Zookeeper.getAnimal(2);
		z2.speak();
		
	}

}
