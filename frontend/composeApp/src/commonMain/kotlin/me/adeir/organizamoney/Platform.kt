package me.adeir.organizamoney

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform