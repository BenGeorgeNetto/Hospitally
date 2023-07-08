@file:OptIn(ExperimentalMaterial3Api::class)

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.hospitally.ui.components.CustomTopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UserDetailsScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            CustomTopBar(
                text = "User Details",
                navController
            )
        }
    ) {

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