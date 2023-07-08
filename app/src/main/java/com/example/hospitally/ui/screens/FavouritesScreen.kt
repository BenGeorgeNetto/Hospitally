@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hospitally.ui.components.CustomTopBar


@Composable
fun FavouritesScreen(
    navController: NavController
) {
    Scaffold(topBar = {
        CustomTopBar(
            text = "Favourites",
            navController
        )
    }) {
        Surface(
            modifier = Modifier.padding(it)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {

            }
        }
    }
}