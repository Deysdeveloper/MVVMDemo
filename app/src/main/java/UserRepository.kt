import kotlinx.coroutines.delay

class UserRepository {
    suspend fun fetchUserData() : Userdata {
        delay(1000)
        return Userdata("Raj",23)
    }
}