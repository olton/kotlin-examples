package operations

/**
 * Программа демонстрирует использование логических операций
 */
fun main(args: Array<String>){
    val a = 1
    val b = 2
    val c = 0
    val d = true
    val e = true
    val f = false

    println("Логические операции")
    println("Выражение a > 0 && b > 0 вернет ${a > 0 && b > 0}")
    println("Выражение a > 0 && c > 0 вернет ${a > 0 && c > 0}")
    println("Выражение a > 0 || c == 0 вернет ${a > 0 && c == 0}")
    println("Выражение !d вернет ${!d}")

    println("Поразрядные логические операции")
    println("Выражение e and f вернет ${e and f}")
    println("Выражение d or e вернет ${d or f}")
    println("Выражение d xor e вернет ${d xor e}")
}