package iset.pidev.smartbookstore.retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apibook {
    public static String BASE_URL ="http://192.168.81.222/smartbook/";

    private static Retrofit retrofit;
    public static Retrofit getbook(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}


