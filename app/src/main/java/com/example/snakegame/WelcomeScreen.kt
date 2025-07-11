package com.example.snakegame

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(
    onStartClick: () -> Unit,
    onProfileClick: () -> Unit,
    onLeaderboardClick: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Добро пожаловать в Змейку!", fontSize = 28.sp)
            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = onStartClick, modifier = Modifier.fillMaxWidth()) {
                Text("Играть")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onProfileClick, modifier = Modifier.fillMaxWidth()) {
                Text("Профиль")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onLeaderboardClick, modifier = Modifier.fillMaxWidth()) {
                Text("Лидерборд")
            }
        }
    }
}
