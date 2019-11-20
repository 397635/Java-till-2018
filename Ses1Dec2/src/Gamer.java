import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Gamer {

	TowerPanel t1;
	TowerPanel t2;
	TowerPanel t3;

	void create() {

		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout frame = new GridLayout(1, 3);
		f.setLayout(frame);

		t1 = new TowerPanel(3);
		t1.setBackground(Color.pink);

		t2 = new TowerPanel(0);
		t2.setBackground(Color.yellow);

		t3 = new TowerPanel(0);
		t3.setBackground(Color.cyan);

		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.setVisible(true);

	}

	boolean move() {
		t1.removeDisc();
		t1.repaint();
		t2.addDisc();
		t2.repaint();
		return true;
	}

}
