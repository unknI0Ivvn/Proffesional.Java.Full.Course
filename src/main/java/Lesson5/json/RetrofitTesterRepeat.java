package Lesson5.json;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class RetrofitTesterRepeat {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder() // билдер для настройки ретрофита
                .baseUrl( "https://api.country.is/") //сайт
                .addConverterFactory(GsonConverterFactory.create()) // создавать обьект по json
                .build(); //создание обьекта класса Retrofit
        GeoCodeServiceRepeat serviceRepeat = retrofit.create(GeoCodeServiceRepeat.class);
        //просим ретрофит создать нам реализацию интерйейса
        //которая сможет выполнять htpps запросы

        Call<GeoCodeRepeat> call = serviceRepeat.getGeoCode("8.8.4.4"); //запрос
        //response - результат запроса
        Response<GeoCodeRepeat> response = call.execute(); // 1 вариант - синхронный запрос
        //call.enqueue(); // 2 вариант - асинхронный запрос - происходит в другом поток выполнения
        if(response.isSuccessful()) // если результат запроса удачный
        {
            GeoCodeRepeat geoCodeRepeat = response.body();
            System.out.println("Country:"+geoCodeRepeat.getCountry()+",ip:"+geoCodeRepeat.getIp());

        }
        System.exit(0);

    }
}
