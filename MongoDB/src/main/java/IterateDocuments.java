import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.async.SingleResultCallback;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class IterateDocuments {

	public static void main(String[] args) {
		MongoClient client = new MongoClient();
		MongoDatabase database = client.getDatabase("local");
		MongoCollection<Document> collection = database.getCollection("employees");
		Block<Document> printDocumentBlock = new Block<Document>() {
		    @Override
		    public void apply(final Document document) {
		        System.out.println(document.toJson());
		    }
		};
		SingleResultCallback<Void> callbackWhenFinished = new SingleResultCallback<Void>() {
		    @Override
		    public void onResult(final Void result, final Throwable t) {
		        System.out.println("Operation Finished!");
		    }
		};
		collection.find().forEach(printDocumentBlock);
	}

}
