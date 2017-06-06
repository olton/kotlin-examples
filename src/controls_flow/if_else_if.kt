package controls_flow

/**
 * Программа демонстрирует if-else-if
 */
fun main(args: Array<String>){
    val month = 4
    val season: String

    if (month == 12 || month == 1 || month == 2)
        season = "зиме"
    else if (month == 3 || month == 4 || month == 5)
        season = "весне"
    else if (month == 6 || month == 7 || month == 8)
        season = "лету"
    else if (month == 9 || month == 10 || month == 11)
        season = "осени"
    else
        season = "вымышленным месяцам"

    println("Указанный месяц относится к $season")
}
