import javax.swing.*;

import java.awt.*;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gamer g1 = new Gamer();

		g1.create();
		JOptionPane.showMessageDialog(null, "About to remove disc", "ACTION", JOptionPane.INFORMATION_MESSAGE);
		// shows message before removing disc

		g1.move();

	}

}
