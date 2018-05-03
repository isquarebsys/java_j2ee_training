package file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			// create new file input stream
			fos = new FileOutputStream("D:\\ws\\git\\java\\Core\\src\\file\\test.txt");
			// read till the end of the file
			fos.write(new String("Writing from Java program").getBytes());
		} catch (Exception ex) {
			// if any error occurs
			ex.printStackTrace();
		} finally {
			// releases all system resources from the streams
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}		
}
