@file:OptIn(ExperimentalMaterial3Api::class)

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hospitally.data.UserData
import com.example.hospitally.ui.components.CustomTopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserDetailsScreen(
    navController: NavController
) {
    Scaffold(topBar = {
        CustomTopBar(
            text = "User Details", navController
        )
    }) {
        val user = UserData.getUserData()
        Surface(
            modifier = Modifier.padding(it)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Name",
                    style = MaterialTheme.typography.headlineSmall,
                )
                Text(
                    text = user.name,
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Age",
                    style = MaterialTheme.typography.headlineSmall,
                )
                Text(
                    text = user.age.toString(),
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Phone",
                    style = MaterialTheme.typography.headlineSmall,
                )
                Text(
                    text = user.phone.toString(),
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Address",
                    style = MaterialTheme.typography.headlineSmall,
                )
                Text(
                    text = user.address,
                    style = MaterialTheme.typography.bodyLarge,
                )
            }

        }
    }
}


//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_YES, name = "DefaultPreviewDark"
//)
//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_NO, name = "DefaultPreviewLight"
//)
//@Composable
//private fun UserDetailsScreenPreview() {
//    AppTheme {
//        UserDetailsScreen()
//    }
//}