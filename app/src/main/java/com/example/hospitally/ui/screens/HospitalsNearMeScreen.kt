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
fun HospitalsNearMeScreen(
    navController: NavController
) {
    Scaffold(topBar = {
        CustomTopBar(
            text = "Hospitals Near Me",
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
                // TODO: implement search bar

                // TODO: implement lazy list of hospitals
                HospitalCard(
                    name = "Apollo Hospital",
                    latitude = 12.9716,
                    longitude = 77.5946,
                    specialities = listOf("Cardiology", "Neurology"),
                    address = "Bannerghatta Road, Bengaluru",
                    phoneNumber = "080 2630 4050",
                )
            }
        }
    }
}