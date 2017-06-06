package controls_flow

/**
 * Программа демонстрирует работу выражения when
 */
fun main(args: Array<String>){
    val month = 4
    val season: String

    season = when (month) {
        12, 1, 2 -> "зиме"
        3, 4, 5 -> "весне"
        6, 7, 8 -> "лету"
        9, 10, 11 -> "осени"
        else -> "непонятно куда"
    }

    println("Указанный месяц относится к $season")
}
