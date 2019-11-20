
public class Car {

	String brand;
	String model;
	boolean isstarted;
	void start() {
		System.out.println("The brand of the car is " + brand + ", and the model of the car is " + model + ".");
		System.out.println("Checking engine");
		System.out.println("Checking the gas");
		System.out.println("Ignite");
		System.out.println("Starting the car :" + " " + brand + " " + model);
	
		isstarted = true;
		
		if (isstarted == true) {
			System.out.println(brand + " " + model + " has started.");
		} else {
			System.out.println(brand + " " + model + "has already started.");
		}
	}
	
	void stop() {
		System.out.println ("Stopping the car :" + " " + brand + " " + model);

	}
	
	
}
