package retrofit;

import java.io.IOException;

import jersey.Message;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MessageTestWithoutCallBack {
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
			    .build();
			MessageService service = retrofit.create(MessageService.class);
			Call<Message> call=service.getMessage();
			try {
				Message message=call.execute().body();
				System.out.println("firstName: "+message.getFirstName());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
