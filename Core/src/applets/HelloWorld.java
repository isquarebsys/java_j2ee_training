package applets;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * The Applet can be run in 2 ways
 * 	1. By Run-Run as Applet
 * 	2. In Browser html file, under body, add-><applet code="First.class" width="300" height="300">  
 * 		2.1. Compile the Java file as usual 
 * @author user
 * 
 * Applet Life Cycle
 * 	Init->Start->Paint->Stop->Destroy
 *
 */
public class HelloWorld extends Applet {

	public void paint(Graphics g) {
		g.drawString("welcome", 150, 150);
	}

}