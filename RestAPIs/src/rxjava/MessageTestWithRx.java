package rxjava;

import jersey.Message;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * http://www.baeldung.com/retrofit-rxjava
 * @author user
 *
 */
public class MessageTestWithRx {
	public static void main(String[] args) {
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        //The logging interceptor will be added to the http client
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
		Retrofit retrofit = new Retrofit.Builder()
				.client(httpClient.build())
			    .baseUrl("http://localhost:8080/rest/")
			    .addConverterFactory(GsonConverterFactory.create())
			    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
			    .build();
			MessageServiceWithRx service = retrofit.create(MessageServiceWithRx.class);
			Observable<Message> call=service.getMessage();
			try {
				Observable<Message> message=call.asObservable();
				System.out.println("firstName: "+message.distinct());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
