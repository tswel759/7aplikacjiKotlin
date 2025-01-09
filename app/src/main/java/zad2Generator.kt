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



    fun main() {

}
}