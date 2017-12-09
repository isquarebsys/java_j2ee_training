package retrofit;

import jersey.Message;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MessageTest {
	public static void main(String[] args) {
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("http://localhost:8080/rest/")
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();
			MessageService service = retrofit.create(MessageService.class);
			Message message=(Message) service.getMessage();
			System.out.println("First Name: "+message.getFirstName());
			System.out.println("Last Name: "+message.getLastName());
			
	}
}
