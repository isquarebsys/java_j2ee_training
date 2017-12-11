package rxjava;

import jersey.Message;
import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface MessageServiceWithRx {
	  @GET("jersey/message")
	  Observable<Message> getMessage();
	}