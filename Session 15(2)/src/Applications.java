
public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
			p1.homeAddress.State = "Oregon";
			
			TaxCalc t = new TaxCalc (p1);
			System.out.println(t.calcTax());
			
			
		
	}

}
