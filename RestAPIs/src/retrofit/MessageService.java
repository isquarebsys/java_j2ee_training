package retrofit;

import jersey.Message;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MessageService {
	  @GET("message")
	  Call<Message> getMessage();
	}