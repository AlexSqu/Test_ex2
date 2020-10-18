import retrofit2.Call
import retrofit2.http.GET

class posts_test(private val users : List<users_data>) {

    fun getSize() = users.size

}