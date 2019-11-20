//using class house
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House house1 = new House ();
		house1.streetaddress1 = "15868 NW West Union Rd";
		house1.streetaddress2 = "Apt 45";
		house1.city = "Portland";
		house1.state = "OR";
		house1.zipcode = 97229;
		
		System.out.println("House address is: \n" +  house1.streetaddress1  + " " + house1.streetaddress2 + " " +  house1.city  + " " + house1.state  + " " + house1.zipcode  );
		
	}

}
