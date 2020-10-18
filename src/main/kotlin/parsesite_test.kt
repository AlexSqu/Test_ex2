import retrofit2.Call
import retrofit2.http.GET

interface parsesite_test{

    @GET("users")
    fun fetchAllUsers():Call<List<users_data>>

    @GET("posts")
    fun fetchAllPosts(): Call<List<posts_data>>

}