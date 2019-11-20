import java.awt.GridLayout;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JButton b1 = new JButton();
		//b1.setText("1"); 
		
		//JButton b2 = new JButton ();
		//b2.setText("2");
		
		//create 10 buttons 
		//create + - * /
		//orange3 enum enumeration
		

		//JPanel p1 = new JPanel();
		//p1.add(b1);
		//p1.add(b2);
		javax.swing.JFrame j1 = new javax.swing.JFrame();
		j1.setSize(300, 300);
		j1.setTitle("Gauri's Calculator");
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1.setVisible(true);
		//j1.setLayout();
		
		
		GridLayout g1 = new GridLayout (4,3);
		
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(g1);
		j1.add(p1);
		
		
		
		for( int i = 0;i<10 ; i=i+1) {
			JButton b1 = new JButton ();
			b1.setText(Integer.toString(i));
			p1.add(b1);
			
			
		}
		
		j1.setVisible(true);
//look at session 24
		
		
	

	}

}
