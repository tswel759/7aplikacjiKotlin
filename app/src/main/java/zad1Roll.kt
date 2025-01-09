interface RollingTool {
    fun roll(): String
}

class Coin : RollingTool {
    override fun roll(): String {
        return if ((1..2).random() == 1) "Heads" else "Tails"
    }
}

class Dice : RollingTool {
    override fun roll(): String {
        return (1..6).random().toString()
    }
}

fun main() {
    println("Wybierz opcje: 1 - Rzut moneta, 2 - Rzut koscia")
    val choice = readLine()?.toIntOrNull()

    val result = when (choice) {
        1 -> Coin().roll()
        2 -> Dice().roll()
        else -> "Nieprawidlowy wybor"
    }
    println("Wynik: $result")
}
