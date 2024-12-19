package me.adeir.organizamoney.navigation
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class Navigator {
    private var _currentRoute by mutableStateOf<Route>(Route.Home)
    val currentRoute: State<Route> = mutableStateOf(_currentRoute)

    fun navigateTo(route: Route) {
        _currentRoute = route
    }

    fun goBack() {
        // Implement back navigation logic (e.g., stack-based navigation)
    }
}
