package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * https://www.javatpoint.com/event-handling-in-java
 * 
 * Frame is a Container and can have other fields like Buttons, Text etc
 * @author user
 *
 */
class AWTCalculatorSample implements ActionListener {
	Frame f;
	TextField textOne, textTwo, resultText;

	AWTCalculatorSample() {
		f = new Frame();
		textOne = new TextField();
		textOne.setBounds(30, 50, 30, 30);
		textTwo = new TextField();
		textTwo.setBounds(60, 50, 30, 30);
		resultText = new TextField();
		resultText.setBounds(90, 50, 30, 30);
		Button addButton = new Button("+");
		addButton.addActionListener(this);
		Button substractButton = new Button("-");
		// setBounds(int xaxis, int yaxis, int width, int height) decides the position
		addButton.setBounds(30, 80, 30, 30);
		substractButton.setBounds(60, 80, 30, 30);
		substractButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int firstNumber = Integer.parseInt(textOne.getText());
				int secondNumber = Integer.parseInt(textTwo.getText());
				resultText.setText(firstNumber - secondNumber + "");
			}
		});
		f.add(textOne);
		f.add(textTwo);
		f.add(resultText);
		f.add(addButton);
		f.add(substractButton);
		f.setSize(300, 300);
		f.setLayout(new LayoutManager() {

			@Override
			public void removeLayoutComponent(Component comp) {
				// TODO Auto-generated method stub

			}

			@Override
			public Dimension preferredLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Dimension minimumLayoutSize(Container parent) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void layoutContainer(Container parent) {
				// TODO Auto-generated method stub

			}

			@Override
			public void addLayoutComponent(String name, Component comp) {
				// TODO Auto-generated method stub

			}
		});
		f.setVisible(true);
	}

	public static void main(String args[]) {
		AWTCalculatorSample f = new AWTCalculatorSample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int firstNumber = Integer.parseInt(textOne.getText());
		int secondNumber = Integer.parseInt(textTwo.getText());
		resultText.setText(firstNumber + secondNumber + "");

	}
}