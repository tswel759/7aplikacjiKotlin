class Krokomierz {

    companion object {
        private var liczbaKrokow = 0

        fun zrobKrok() {
            liczbaKrokow++
        }

        fun pokazKroki() {
            println("Liczba kroków: $liczbaKrokow")
        }

        fun resetujKroki() {
            liczbaKrokow = 0
            println("Licznik kroków został zresetowany.")
        }

    }

    fun main() {

    }
}