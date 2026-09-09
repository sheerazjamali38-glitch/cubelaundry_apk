package com.cubelaundry.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HistoryScreen(navController: NavController) {
    // Mock data – replace with API call
    val orders = listOf(
        Triple("CL-000001", "15 Aug 2026", "Rs. 1,500"),
        Triple("CL-000002", "14 Aug 2026", "Rs. 2,200"),
        Triple("CL-000003", "13 Aug 2026", "Rs. 800"),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "My Orders",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn {
            items(orders) { (invoice, date, total) ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    onClick = {
                        navController.navigate("invoice/$invoice")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(text = invoice, fontWeight = FontWeight.Bold)
                            Text(text = date, style = MaterialTheme.typography.bodySmall)
                        }
                        Text(text = total, color = MaterialTheme.colorScheme.primary)
                    }
                }
            }
        }
    }
}
