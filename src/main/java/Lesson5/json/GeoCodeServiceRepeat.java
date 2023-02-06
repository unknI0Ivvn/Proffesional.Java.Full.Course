package Lesson5.json;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GeoCodeServiceRepeat {
    @GET("/{ip}")
    Call<GeoCodeRepeat> getGeoCode(@Path("ip")String ip); //GET htpps://.../9 9 9 9

    //@GET("/{country}/{ip}")
   // Call<GeoCodeRepeat> getGeoCode(@Path("ip")String ip),@Path("country") String c); //GET htpps://.../ip

}
