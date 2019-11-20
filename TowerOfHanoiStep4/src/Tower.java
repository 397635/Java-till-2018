
public class Tower {
	Disc disc;
	void draw (){
		System.out.println("drawing tower");
		this.disc.draw();
	}
	
	void addDisc(Disc d) {
		System.out.println("adding disc in tower");
		this.disc = d;
	}

}
