
public class Gamer {
	Tower t = new Tower("A");
	Tower t2 = new Tower("B");

	DiscManager manager = new DiscManager();
	Disc ds = manager.getSmallDisc();
	Disc dm = manager.getMediumDisc();
	Disc dl = manager.getLargeDisc();

	void create() {

		t.addDisc(ds);
		t.addDisc(dm);
		t.addDisc(dl);
		t.draw();

		t2.draw();

	}

	void move() {
		t.removeDisc();
		t2.addDisc(ds);
		t.draw();
		t2.draw();

	}

}
