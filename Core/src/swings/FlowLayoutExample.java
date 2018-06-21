package swings;

import java.awt.*;
import javax.swing.*;

/**
 * Arranges the components in a line, 1 after another (in a flow). This is the
 * default layout
 * 
 * @author user
 *
 */
public class FlowLayoutExample {
	JFrame f;

	FlowLayoutExample() {
		f = new JFrame();

		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		// setting flow layout of right alignment

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutExample();
	}
}