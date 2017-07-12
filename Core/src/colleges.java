import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class colleges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap peacock = new HashMap();
		peacock.put("Color", "Blue");
		peacock.put("No of eyes", "2");
//		System.out.println("No of eyes: " + peacock.get("No of eyes"));

		Iterator keySetIterator = peacock.keySet().iterator();
		while (keySetIterator.hasNext()) {
			String key = (String) keySetIterator.next();
			System.out.println("Key: " + key);
			String value = (String) peacock.get(key);
			System.out.println("Value: " + value);
		}
	}

}
