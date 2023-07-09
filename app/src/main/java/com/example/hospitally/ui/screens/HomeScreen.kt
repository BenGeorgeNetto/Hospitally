@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.hospitally.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hospitally.R
import com.example.hospitally.ui.theme.AppTheme

@Composable
fun HomeScreen(
    navController: NavController
) {
    val name = stringResource(R.string.name)
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(
                    "Hospitally",
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontWeight = FontWeight.Black,
                    ),
                    modifier = Modifier.padding(8.dp),
                )
            }, actions = {
                IconButton(
                    onClick = {
                        navController.navigate("user_details")
                    },
                ) {
                    Icon(
                        Icons.Filled.AccountCircle, contentDescription = null
                    )
                }
            })
        },
        // TODO: implement button functions
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {
                        navController.navigate("favourites")
                    }) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Favourites"
                        )
                    }
                    IconButton(onClick = {
                        navController.navigate("settings")
                    }) {
                        Icon(Icons.Filled.Settings, contentDescription = "Settings")
                    }
                },
                floatingActionButton = {
                    ExtendedFloatingActionButton(text = { Text("Hospitals near me") }, icon = {
                        Icon(
                            Icons.Outlined.Search, contentDescription = "Hospitals near me button"
                        )
                    }, onClick = {
                        navController.navigate("hospitals_near_me")
                    })
                }
            )
        },
    ) {
        Surface(
            modifier = Modifier.padding(it)
        ) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        "Welcome back",
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier,
                        textAlign = TextAlign.Left
                    )
                    Text(
                        name,
                        style = MaterialTheme.typography.headlineLarge.copy(
                            fontWeight = FontWeight.Black
                        ),
                        modifier = Modifier, textAlign = TextAlign.Left,
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES, name = "DefaultPreviewDark"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO, name = "DefaultPreviewLight"
)
@Composable
private fun HomeScreenPreview() {
    AppTheme {
        HomeScreen(navController = rememberNavController())
    }
}