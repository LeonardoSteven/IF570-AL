package id.ac.umn.week11_leonardosteven_37279;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {
    @GET("posts")
    Call<List<PostModel>> getPosts();
}
