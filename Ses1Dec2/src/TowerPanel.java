import java.awt.*;

import javax.swing.*;

public class TowerPanel extends JPanel {

	int numberofDiscs;

	TowerPanel(int numberofDiscs) {

		this.numberofDiscs = numberofDiscs;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.white);
		g2d.fillRect(150, 100, 30, 500);

		g2d.setColor(Color.white);
		g2d.fillRect(40, 600, 250, 30);

		if (numberofDiscs == 3) {
			Disc d1 = new Disc(Color.black, 90, 570, 150, 30);
			d1.draw(g);

			Disc d2 = new Disc(Color.blue, 115, 540, 100, 30);
			d2.draw(g);

			Disc d3 = new Disc(Color.magenta, 140, 510, 50, 30);
			d3.draw(g);

		} else if (numberofDiscs == 2) {
			Disc d1 = new Disc(Color.black, 90, 570, 150, 30);
			d1.draw(g);

			Disc d2 = new Disc(Color.blue, 115, 540, 100, 30);
			d2.draw(g);

		} else if (numberofDiscs == 1) {
			Disc d1 = new Disc(Color.black, 90, 570, 150, 30);
			d1.draw(g);

		} else {

		}

	}

	void removeDisc() {
		// has to remove top disc from tower
		numberofDiscs = numberofDiscs - 1;
	}

	void addDisc() {
		// has to add the removed disc onto a different tower
		numberofDiscs = numberofDiscs +1;
	}

}
