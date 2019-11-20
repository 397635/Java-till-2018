import java.util.*;

public class Tower {
	String name;
	Tower(String name){
		this.name=name;
	}
	ArrayList<Disc> discs = new ArrayList<Disc>();

	void addDisc(Disc d) {
		this.discs.add(d);
	}
	

	void draw() {
		System.out.println("Tower "+name);
		for (int i = 0; i < discs.size(); i++) {
			this.discs.get(i).draw();

		}
	}

}
