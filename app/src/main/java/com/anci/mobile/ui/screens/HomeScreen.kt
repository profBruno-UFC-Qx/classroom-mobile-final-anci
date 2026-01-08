package com.anci.mobile.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    onNavigateToSettings: () -> Unit,
    onNavigateToEmergency: () -> Unit,
    onNavigateToCourses: () -> Unit,
    onNavigateToSupport: () -> Unit
) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Text(text = "Home Screen")
                Button(onClick = onNavigateToCourses) { Text("Cursos") }
                Button(onClick = onNavigateToEmergency) { Text("Emergência") }
                Button(onClick = onNavigateToSettings) { Text("Configurações") }
                Button(onClick = onNavigateToSupport) { Text("Suporte") }
            }
        }
    }
}
