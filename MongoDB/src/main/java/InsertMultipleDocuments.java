import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertMultipleDocuments {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("local");
		MongoCollection<Document> collection = database.getCollection("employees");
		Document doc = new Document("name", "deepak");
		List<Document> multipleDocs=new ArrayList<Document>();
		multipleDocs.add(doc);
		collection.insertMany(multipleDocs);
		
	}
}
