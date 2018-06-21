package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * https://www.javatpoint.com/java-awt-dialog
 * 
 * @author user
 *
 */
public class AWTDialogExample {
	private static Dialog d;

	AWTDialogExample() {
		Frame f = new Frame();
		d = new Dialog(f, "Dialog Example", true);
		d.setLayout(new FlowLayout());
		Button b = new Button("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AWTDialogExample.d.setVisible(false);
			}
		});
		d.add(new Label("Click button to continue."));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);
	}

	public static void main(String args[]) {
		new AWTDialogExample();
	}
}
