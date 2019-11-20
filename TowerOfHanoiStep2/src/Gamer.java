
public class Gamer {
	
	void create() {
		System.out.println("creating screen");
		Tower t = new Tower ();
		t.draw();
		
	}
	void move (int from, int to) {
		System.out.println("moving " + from + "to " + to);
	}
	
	
}
