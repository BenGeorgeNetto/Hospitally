import android.content.res.Configuration
import android.location.Location
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HospitalCard(
    name: String,
    latitude: Double,
    longitude: Double,
    specialities: List<String>,
    address: String,
    phoneNumber: String,
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
                text = name,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Specialities: ${specialities.joinToString()}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Address: $address",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Phone Number: $phoneNumber",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = "Distance: ${distanceBetween(latitude, longitude)}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp),
            )
        }
    }
}

fun distanceBetween(latitude: Double, longitude: Double): Float {
    val currentLocation = Location("currentLocation")
    currentLocation.latitude = latitude
    currentLocation.longitude = longitude
    val hospitalLocation = Location("hospitalLocation")
    hospitalLocation.latitude = 12.9716
    hospitalLocation.longitude = 77.5946
    return currentLocation.distanceTo(hospitalLocation) / 1000
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES, name = "DefaultPreviewDark"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO, name = "DefaultPreviewLight"
)
@Composable
private fun HospitalCardPreview(
) {
    HospitalCard(
        name = "Apollo Hospital",
        latitude = 12.9716,
        longitude = 77.5946,
        specialities = listOf("Cardiology", "Neurology"),
        address = "Bannerghatta Road, Bengaluru",
        phoneNumber = "080 2630 4050",
    )
}