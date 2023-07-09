package com.example.hospitally.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.hospitally.data.models.Hospital

@Composable
fun HospitalCard(
    hospital: Hospital
) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        )
    ) {
        Column(
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = hospital.hospitalName,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Specialities: ${hospital.specializations}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Address: ${hospital.address}}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Phone Number: ${hospital.contact}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Distance: ${calculateDistance(hospital.lat,hospital.long)} m",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
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
//private fun HospitalCardPreview(
//) {
//
//}
