package id.ac.umn.week11_leonardosteven_37279;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataRepository {
    static String placeholderUrl = "https://jsonplaceholder.typicode.com";

    static final PostService create(){
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(placeholderUrl).build();

        return retrofit.create(PostService.class);
    }
}
