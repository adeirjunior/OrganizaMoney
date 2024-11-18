package me.adeir.organizamoney.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// Example data class for transactions summary
data class HomeState(
    val totalIncome: Double = 0.0,
    val totalExpense: Double = 0.0,
    val balance: Double = 0.0,
    val recentTransactions: List<Transaction> = emptyList()
)

// Example data class for a transaction
data class Transaction(
    val id: Int,
    val description: String,
    val amount: Double,
    val type: TransactionType // INCOME or EXPENSE
)

enum class TransactionType {
    INCOME, EXPENSE
}

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> get() = _state

    init {
        loadHomeData()
    }

    private fun loadHomeData() {
        // Simulate loading data asynchronously
        viewModelScope.launch {
            // Example of loading data from repository
            val transactions = getMockTransactions()
            val income = transactions.filter { it.type == TransactionType.INCOME }.sumOf { it.amount }
            val expense = transactions.filter { it.type == TransactionType.EXPENSE }.sumOf { it.amount }

            _state.value = HomeState(
                totalIncome = income,
                totalExpense = expense,
                balance = income - expense,
                recentTransactions = transactions.take(5) // Show 5 most recent transactions
            )
        }
    }

    private fun getMockTransactions(): List<Transaction> {
        // Mocking some transaction data
        return listOf(
            Transaction(1, "Salary", 3000.0, TransactionType.INCOME),
            Transaction(2, "Rent", 1000.0, TransactionType.EXPENSE),
            Transaction(3, "Groceries", 200.0, TransactionType.EXPENSE),
            Transaction(4, "Freelance", 500.0, TransactionType.INCOME),
            Transaction(5, "Utilities", 150.0, TransactionType.EXPENSE),
            Transaction(6, "Bonus", 700.0, TransactionType.INCOME)
        )
    }
}
