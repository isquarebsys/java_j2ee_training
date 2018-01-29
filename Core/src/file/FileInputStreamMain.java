package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		int i = 0;
		char c;
		try {
			// create new file input stream
			fis = new FileInputStream("D:\\ws\\git\\java\\Core\\src\\file\\test.txt");
			// read till the end of the file
			while ((i = fis.read()) != -1) {
				// converts integer to character
				c = (char) i;
				// prints character
				System.out.print(c);
			}
		} catch (Exception ex) {
			// if any error occurs
			ex.printStackTrace();
		} finally {
			// releases all system resources from the streams
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
