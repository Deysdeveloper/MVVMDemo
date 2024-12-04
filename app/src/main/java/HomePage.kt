import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomePage(modifier: Modifier= Modifier,viewModel: HomeViewModel) {

    val userdata = viewModel.userdata.observeAsState()

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            viewModel.getUserData()
        },modifier= Modifier.padding(12.dp) ) {
            Text(text = "Get Data", modifier.padding(12.dp))
        }
        userdata.value?.Name?.let {
            Text(text = "Name: $it")
        }
        userdata.value?.Age?.let {
            Text(text = "Age: $it")
        }
    }
}
