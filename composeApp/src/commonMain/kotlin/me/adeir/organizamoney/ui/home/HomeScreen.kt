package me.adeir.organizamoney.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import organizamoney.composeapp.generated.resources.Res

enum class CupcakeScreen(val title: String) {
    Start(title = "Nome do Aplicativo"),
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel { HomeViewModel() },
) {


    Column {
        Text("Welcome to the Finance App")
        Button (onClick = {}) {
            Text("View Transactions")
        }
    }
}
