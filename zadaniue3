data class Ksiazka (
    val tytul: String,
    val autor: String,
    val rokWydania: Int
)

class ZarzadzajKsiazkami {
    private val ksiazki = mutableListOf<Ksiazka>()


    fun dodajKsiazke(tytul: String, autor: String, rokWydania: Int) {
        val ksiazka = Ksiazka(tytul, autor, rokWydania)
        ksiazki.add(ksiazka)
    }


    fun wyswietlWszystkieKsiazki() {
        if (ksiazki.isEmpty()) {
            println("Nie ma żadnej książki.")
            return
        }
        println("\nZbiór książek:")
        ksiazki.forEach { println("{$it.tytul} - ${it.autor} (${it.rokWydania})")}
    }


    fun filtrujPoAutorze(autor: String) {
        val filtrowanie = ksiazki.filter { it.autor.equals(autor, ignoreCase = true) }
        if (filtrowanie.isEmpty()) {
            println("Brak książki tego pisarza $autor")
            return
        }
        println("\nLista bestsellerów pisarza $autor:")
        filtrowanie.forEach { println("${it.tytul} (${it.rokWydania})")}
    }


    fun filtrujPoRoku(rok: Int) {
        val filtrowanie = ksiazki.filter { it.rokWydania == rok }
        if (filtrowanie.isEmpty()) {
            println("Brak książki tegorocznej $rok")
            return
        }
        println("\nLista tegorocznych książek $rok:")
        filtrowanie.forEach { println("${it.tytul} (${it.rokWydania})")}
    }


    fun sortowaniePoTytule() {
        if (ksiazki.isEmpty()) {
            println("Nie ma żadnej książki.")
            return
        }
        println("\nLista posortowanych książek:")
        ksiazki.sortedBy { it.tytul }
            .forEach { println("${it.tytul} - ${it.autor} (${it.rokWydania})")}
    }
}

fun main() {
    val menedzer = ZarzadzajKsiazkami()

    menedzer.dodajKsiazke("Harry Potter", "J.K. Rowling", 1999)
    menedzer.dodajKsiazke("Wiedźmin", "A. Sapkowski", 2024)

    menedzer.wyswietlWszystkieKsiazki()
    menedzer.filtrujPoAutorze("Sapkowski")
    menedzer.filtrujPoRoku(1999)
    menedzer.sortowaniePoTytule()

}
