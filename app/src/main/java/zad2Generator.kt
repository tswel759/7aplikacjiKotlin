object Quotes {
    private val quotes = mutableListOf(
        "Kto pod kim dolki kopie, ten szybciej awansuje.",
        "Bogatym staje sie ten, kto okrada panstwo szybciej niz ono jego.",
        "baba z wozu, koniom lzej.",
        "co dwie glowy, to nie jedna."
    )

    fun getRandomQuote(): String {
        return quotes.random()
    }
    fun addQuote(quote: String) {
        quotes.add(quote)
    }

}
    fun main() {
        println("Losowy cytat: ${Quotes.getRandomQuote()}")

        println("Podaj nowy cytat:")
        val newQuote = readLine() ?: ""
        if (newQuote.isNotEmpty()) {
            Quotes.addQuote(newQuote)
            println("Nowy cytat dodany!")
        }

        println("Nowy losowy cytat: ${Quotes.getRandomQuote()}")
    }
