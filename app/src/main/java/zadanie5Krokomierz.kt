class Krokomierz {

    companion object {
        private var liczbaKrokow = 0

        fun zrobKrok() {
            liczbaKrokow++
        }

        fun pokazKroki() {
            println("Liczba krokow: $liczbaKrokow")
        }

        fun resetujKroki() {
            liczbaKrokow = 0
            println("Licznik krokow zostal zresetowany.")
        }
    }
    }

    fun main() {
        Krokomierz.zrobKrok()
        Krokomierz.zrobKrok()
        Krokomierz.zrobKrok()
        Krokomierz.zrobKrok()
        Krokomierz.zrobKrok()
        Krokomierz.pokazKroki()

        Krokomierz.resetujKroki()
        Krokomierz.pokazKroki()
    }