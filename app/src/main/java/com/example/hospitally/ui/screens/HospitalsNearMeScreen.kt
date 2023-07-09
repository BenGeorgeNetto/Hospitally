@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hospitally.data.Datasource
import com.example.hospitally.data.models.Hospital
import com.example.hospitally.ui.components.CustomTopBar
import com.example.hospitally.ui.components.HospitalCard


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
                HospitalList(hospitals = Datasource().loadHospitals())
            }
        }
    }
}

@Composable
private fun HospitalList(
    hospitals: List<Hospital>
) {
    LazyColumn(
        modifier = Modifier
            .padding(8.dp),
    ) {
        items(hospitals) { hospital ->
            HospitalCard(hospital)
        }
    }
}
