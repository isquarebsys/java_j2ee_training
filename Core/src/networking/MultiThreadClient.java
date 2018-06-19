package networking;

import java.io.*;
import java.net.*;

/**
 * 
 * @author user
 * 
 * Client does the following:
 * 1. Listens to the socket
 * 2. Sends a message
 * 3. closes the socket
 * 
 * */

public class MultiThreadClient {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 8888);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("quit");
			dout.writeUTF("\n"+"quit");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
