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

public class SocketClient {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
