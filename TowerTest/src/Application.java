import java.awt.*;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout frame = new GridLayout(1,2);
		f.setLayout(frame);

	
		TowerPanel t1 = new TowerPanel(150, 400);
		t1.baseheight = 50;
		t1.basewidth = 300;
		t1.towerheight=300;
		t1.towerwidth = 50;
		t1.setBackground(Color.pink);
		
	
		
		TowerPanel t2 = new TowerPanel(600, 400);
		t1.baseheight = 50;
		t1.basewidth = 200;
		t1.towerheight=200;
		t1.towerwidth = 50;
		Disc d1= new Disc();
		t1.addDisc(d1);
		
		t2.setBackground(Color.cyan);
	
		f.add(t1);
	//	f.setVisible(true);
	//	f.add(t2);
		f.setVisible(true);
	
		
		
		
	
	}

}
