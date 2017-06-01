package operations

/**
 * Программа демонстрирует использование логических операций
 */
fun main(args: Array<String>){
    val a = 1
    val b = 2
    val c = 0
    val d = false

    println("Выражение a > 0 && b > 0 вернет ${a > 0 && b > 0}")
    println("Выражение a > 0 && c > 0 вернет ${a > 0 && c > 0}")
    println("Выражение a > 0 || c == 0 вернет ${a > 0 && c == 0}")
    println("Выражение !d вернет ${!d}")
}