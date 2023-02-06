package Lesson5.HomeworkAnimalsCheat;

//http://cat-fact.herokuapp.com
//    /facts/random
//            ?animal_type=cat&amount=2

//https://square.github.io/retrofit/
// https://www.jsonschema2pojo.org/
// https://codebeautify.org/jsonviewer
//https://github.com/public-apis/public-apis#index
//example https://www.frankfurter.app/docs/

//facts/random/dog/4
///facts/random?animal_type={animal}&amount={number} //@Path

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface AnimalsService {
    // /facts/random?animal_type=dog&amount=2 //Query ? and & добавляются автоматически
    @GET("facts/random")
    Call<List<Fact>> getFacts(
            @Query("animal type") String animal, // cat
            @Query("amount") int number
    );
    @GET("facts/random")
    Call<Fact> getFact();

}
