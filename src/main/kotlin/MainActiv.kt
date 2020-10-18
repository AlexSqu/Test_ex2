import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

fun main() {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(parsesite_test::class.java)

    api.fetchAllUsers().enqueue(object : Callback<List<users_data>>{
        override fun onResponse(call: Call<List<users_data>>, response: Response<List<users_data>>) {
            print("все норм ${response.body()!![9].phone} ")
            //TODO("Not yet implemented")


            api.fetchAllPosts().enqueue(object : Callback<List<posts_data>>{
                override fun onResponse(call: Call<List<posts_data>>, response: Response<List<posts_data>>) {
                    print("все нормально ${response.body()!![9].title}")
                    //TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<List<posts_data>>, t: Throwable) {
                    //TODO("Not yet implemented")

                }
            })
        }

        override fun onFailure(call: Call<List<users_data>>, t: Throwable) {
            //TODO("Not yet implemented")

        }
    })







}

