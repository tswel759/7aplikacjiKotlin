interface Pogoda {
    fun opis(): String
}

class Slonce : Pogoda {
    override fun opis() = "Super gorąco, można wyjść do restauracji!"
}

class Deszcz : Pogoda {
    override fun opis() = "Leje, więc bierz parasolkę!"
}

class Chmury : Pogoda {
    override fun opis() = "Pochmurno, może padać!"
}

data class Miasto (
    val nazwa: String,
    var aktualnaPogoda: Pogoda
)

class PrognozaPogody {
    private val miasta = mutableListOf<Miasto>()
   
    fun dodajMiasto(nazwa: String, pogoda: Pogoda) {
        miasta.add(Miasto(nazwa, pogoda))
    }
   
       fun wyswietlDostepneMiasta() {
        println("\nLista miejscowości:")
        miasta.forEachIndexed { index, miasto ->
            println("${index + 1}. ${miasto.nazwa}")
    }
}
   
    fun wyswietlPogode(indeksMiasta: Int) {
        try {
            val miasto = miasta[indeksMiasta - 1]
            println("\nPrognozujemy dla miejscowości takie warunki pogodowe ${miasto.nazwa}:")
            println(miasto.aktualnaPogoda.opis())
        } catch (e: IndexOutOfBoundsException) {
            println("Podałeś zły numerek miejscowości!")
        }
    }
       
     fun aktualizujPogode(indeksMiasta: Int, nowaPogoda: Pogoda) {
         try {
             miasta[indeksMiasta - 1].aktualnaPogoda = nowaPogoda
             println("Nastąpiła aktualizacja prognozy miejscowości ${miasta[indeksMiasta -1].nazwa}")
         } catch (e: IndexOutOfBoundsException) {
             println("Podałeś zły numerek miejscowości!")
         }
     }
}
   
    fun main() {
        val prognoza = PrognozaPogody()
       
        prognoza.dodajMiasto("Olsztyn", Slonce())
        prognoza.dodajMiasto("Opole", Deszcz())
        prognoza.dodajMiasto("Otwock", Chmury())
        prognoza.dodajMiasto("Warszawa", Slonce())
        prognoza.dodajMiasto("Los Angeles", Chmury())
       
        prognoza.wyswietlDostepneMiasta()
       
        println("\nWyświetlamy pogodę każdej danej miejscowości:")
        for (i in 1..3) {
            prognoza.wyswietlPogode(i)
        }
       
        println("\nNowa prognoza:")
        prognoza.aktualizujPogode(1, Deszcz())
        prognoza.wyswietlPogode(1)
    }
