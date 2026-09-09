package com.cubelaundry.app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cubelaundry.app.R

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
Image(
    painter = painterResource(id = R.drawable.ic_launcher_foreground),
    contentDescription = "Cube Laundry Logo",
    modifier = Modifier.size(120.dp)
)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Cube Laundry",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Fresh • Fast • Reliable",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { navController.navigate("order") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Place Order", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { navController.navigate("history") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "My Orders", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = {
                val intent = android.content.Intent(android.content.Intent.ACTION_VIEW)
                intent.data = android.net.Uri.parse("https://wa.me/923478164692")
                navController.context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Contact on WhatsApp", fontSize = 16.sp)
        }
    }
}
