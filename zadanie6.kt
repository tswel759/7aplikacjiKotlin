fun main() {
    val wynikiMeczy = listOf(50, 75, 30, 90, 60)
    val prog = 70
    val punktyBonusowe = 10

    val przefiltrowaneWyniki = wynikiMeczy.filter { it > prog }
    val wynikiZBonusem = wynikiMeczy.map { it + punktyBonusowe }
    val sumaWynikow = wynikiMeczy.sum()
    val maksymalnyWynik = wynikiMeczy.maxOrNull() ?: 0
    val minimalnyWynik = wynikiMeczy.minOrNull() ?: 0
    val roznica = maksymalnyWynik - minimalnyWynik
    val meczePowyzej70 = wynikiMeczy.count { it > 70 }

    println("Przefiltrowane wyniki: $przefiltrowaneWyniki")
    println("Wyniki z bonusem: $wynikiZBonusem")
    println("Suma wyników: $sumaWynikow")
    println("Maksymalny wynik: $maksymalnyWynik")
    println("Różnica między maksymalnym a minimalnym wynikiem: $roznica")
    println("Mecze powyżej 70 punktów: $meczePowyzej70")
}
