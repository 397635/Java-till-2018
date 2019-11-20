
public class Gamer {
	
	void create() {
		
		DiscManager manager = new DiscManager();
		Disc ds = manager.getSmallDisc();
		Disc dm = manager.getMediumDisc();
		Disc dl = manager.getLargeDisc();
		
		Tower t = new Tower("A");
		t.addDisc(ds);
		t.addDisc(dm);
		t.addDisc(dl);
		t.draw();
		
		Tower t2 = new Tower("B");
		t2.addDisc(dm);
		t2.addDisc(dl);
		t2.draw();
		
		
	}
	void move (int from, int to) {
	}
	
	
}
