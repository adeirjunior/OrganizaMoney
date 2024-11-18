package me.adeir.organizamoney.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import me.adeir.organizamoney.navigation.Route

@Composable
fun HomeScreen(viewModel: HomeViewModel, onNavigateTo: (Route) -> Unit) {
    Column {
        Text("Welcome to the Finance App")
        Button(onClick = { onNavigateTo(Route.Transactions) }) {
            Text("View Transactions")
        }
    }
}
