import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class SimpleTest {

	public static void main(String[] args) {
		try {
			MongoClient mongoClient = new MongoClient();
			List<String> dbs = mongoClient.getDatabaseNames();
			for (String db : dbs) {
				System.out.println("Database Name: " + db);
			}			
			
			DB db = mongoClient.getDB("local");
			DBCollection table = db.getCollection("employees");

			// Add rows to the employees
			BasicDBObject document = new BasicDBObject();
			document.put("name", "vijay");
			document.put("age", 41);
			table.insert(document);

			// Search employees table with name as vijay
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("name", "vijay");

			DBCursor cursor = table.find(searchQuery);
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
