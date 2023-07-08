@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.hospitally.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.Add
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hospitally.ui.theme.AppTheme

@Composable
fun HomeScreen(

) {
    val name = "Rick Astley"
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(
                    "Home",
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontWeight = FontWeight.Black,
                    ),
                    modifier = Modifier.padding(8.dp),
                )
            }, actions = {
                IconButton(
                    onClick = {
                        // TODO: Navigate to the details screen
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
                        // TODO
                    }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = {
                        // TODO
                    }) {
                        Icon(Icons.Filled.LocationOn, contentDescription = "")
                    }
                },
                floatingActionButton = {
                    ExtendedFloatingActionButton(
                        text = { Text("To implement") },
                        icon = { Icon(Icons.Outlined.Add, contentDescription = "") },
                        onClick = {
                            // TODO
                        }
                    )
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
fun HomeScreenPreview() {
    AppTheme {
        HomeScreen()
    }
}