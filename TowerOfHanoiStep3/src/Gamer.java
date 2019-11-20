
public class Gamer {
	
	void create() {
		System.out.println("creating screen");
		
		DiscManager manager = new DiscManager();
		Disc small = manager.getSmallDisc();
		
		Tower t = new Tower ();
		t.addDisc(small);
		t.draw();
		
	}
	void move (int from, int to) {
		System.out.println("moving " + from + "to " + to);
	}
	
	
}
