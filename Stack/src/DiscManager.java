
public class DiscManager {
	Disc big;
	Disc medium;  
	Disc small;
	
	
	
	DiscManager(){
		big = new Disc("big");
		medium = new Disc("medium");
		small = new Disc("small");
		
	}

	Disc getbigDisc() {
		return big;
		
	}
	
	Disc getmediumDisc() {
		return medium;
		
	}
	
	Disc getsmallDisc() {
		return small;
		
	}
}


