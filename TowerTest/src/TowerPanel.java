
import java.awt.*;

import javax.swing.*;

import javax.swing.JFrame;


public class TowerPanel extends JPanel {
	int referx;
	int refery;
	int towerwidth;
	int towerheight;
	int basewidth;
	int baseheight;
	Disc d;
	
	
	TowerPanel(int referx, int refery){
		this.referx = referx;
		this.refery = refery;

		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect( referx - towerwidth/2, refery-towerheight,towerwidth, towerheight);
		g.setColor(Color.white);
		g.fillRect(referx-basewidth/2 , refery,basewidth, baseheight);
		d.draw(g);
		
	}
	
	void addDisc(Disc d) {
		this.d = d;	
		
	}



	
	

		
	}
	
	


