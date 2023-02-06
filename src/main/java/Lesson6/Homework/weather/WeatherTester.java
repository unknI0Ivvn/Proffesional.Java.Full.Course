package Lesson6.Homework.weather;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class WeatherTester {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://api.open-meteo.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherService service = retrofit.create(WeatherService.class);

        Call<Weather> call =service.getWeather(40.875,74.125,"temperature_2m");
       Response<Weather> response = call.execute();

       if(response.isSuccessful())
       {
           Weather w = response.body();
           System.out.println(w.getTimezone());
       }
       else {
           Gson gson = new Gson();
           Error e = gson.fromJson(response.errorBody().string(),Error.class);
           System.out.println(e.reason);
       }
       System.exit(0);
    }
}
