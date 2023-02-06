package Lesson5.HomeworkAnimalsCheat;



import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;


public class AnimalsQuoteTester {
    public static void main(String[] args) throws IOException {

        //Retrofit retrofit = new Retrofit.Builder()
        //                .baseUrl("http://cat-fact.herokuapp.com/")
        //                .addConverterFactory(GsonConverterFactory.create())
        //                .build();
        //                .create(AnimalsService.class);

        //http://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=2
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://cat-fact.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //ретрофит нужен чтобы создать класс имплементяющий аннотированный интерфейс

        AnimalsService service = retrofit.create(AnimalsService.class);
        Call<Fact> call1 = service.getFact();
        Response<Fact> response1 = call1.execute();
        if(response1.isSuccessful())
        {
            Fact f = response1.body();
            System.out.println(f.getText());
        }
/*
       Call<List<Fact>> call = service.getFacts("Cat",3);

        Response<List<Fact>> response = call.execute(); //результат запроса
        if(response.isSuccessful())
        {
            List<Fact> facts = response.body();
            for(Fact f:facts)
            {
                System.out.println(f.getText());
            }
        }
        */



    }
}
