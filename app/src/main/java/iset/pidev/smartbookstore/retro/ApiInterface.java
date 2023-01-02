package iset.pidev.smartbookstore.retro;

import java.util.List;
import iset.pidev.smartbookstore.livre.Livre;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

    public interface ApiInterface {

        @GET("livre.php")
        Call<List<Livre>> getlivre();

        @FormUrlEncoded
        @POST("insertion.php")
        Call<ResponseBody>insertdata(
                @Field("nom")String nom,
                @Field("rubrique") String rubrique
        );
    }

