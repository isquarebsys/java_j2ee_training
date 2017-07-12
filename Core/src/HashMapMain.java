import java.util.HashMap;
import java.util.Iterator;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> college = new HashMap();
		college.put("name", "rec");
		college.put("founding year", "2000");
		System.out.println("NAME " + college.get("name"));
		System.out.println("YEAR" + college.get("founding year"));
		Iterator keySetIterator = college.keySet().iterator();
		while (keySetIterator.hasNext()) {
			String key = (String) keySetIterator.next();
			System.out.println("Key: " + key);
			String value = (String) college.get(key);
			System.out.println("Value: " + value);
		}
	}
}
