package me.adeir.organizamoney

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import me.adeir.organizamoney.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}