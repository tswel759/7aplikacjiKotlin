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
}
