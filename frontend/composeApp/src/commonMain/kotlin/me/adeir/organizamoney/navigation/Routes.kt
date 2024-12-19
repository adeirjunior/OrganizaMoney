package me.adeir.organizamoney.navigation

sealed class Route(val route: String) {
    data object Home : Route("home")
    data object Transactions : Route("transactions")
    data object Budget : Route("budget")
    data object Settings : Route("settings")
}
