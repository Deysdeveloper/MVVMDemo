import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    val userRepository: UserRepository = UserRepository()
    private val _userdata = MutableLiveData<Userdata>()
    val userdata: LiveData<Userdata> = _userdata

    fun getUserData() {
        viewModelScope.launch {
            val getresult = userRepository.fetchUserData()
            _userdata.postValue(getresult)
        }


    }
}