
public class Zookeeper {

	static Animal getAnimal (int option) {
		
		if( option == 1) {

			return new Dog();
					}
		else {
			return new Cat ();
		
		}

	}

}
