package socket;

import java.io.*;
import java.net.*;

/**
 * 
 * @author user
 * 
 * Server does the following:
 * 1. starts the socket
 * 2. waits for message from client
 * 3. closes the socket
 * 
 * */

public class Server1 {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("message= " + str);
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}