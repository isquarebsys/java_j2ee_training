package retrofit;

import jersey.Message;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MessageTestWithCallback {
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
//			try {
//				Message message=call.execute().body();
//				System.out.println("firstName: "+message.getFirstName());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			call.enqueue(new Callback<Message>() {
				
				@Override
				public void onResponse(Call<Message> arg0, Response<Message> arg1) {
					// TODO Auto-generated method stub
					int responseCode=arg1.code();
					System.out.println("Response code: "+responseCode);
					if(responseCode==200) {
						System.out.println("Success");
						System.out.println("Response body: "+arg1.body().getFirstName());
					}else {
						System.out.println("Failure");
					}
				}
				
				@Override
				public void onFailure(Call<Message> arg0, Throwable arg1) {
					// TODO Auto-generated method stub
					System.out.println("Is call executed: "+arg0.isExecuted());
					System.out.println("Is call cancelle: "+arg0.isCanceled());
					System.out.println("Error response message: "+arg0.toString());
				}
			});
	}
}
