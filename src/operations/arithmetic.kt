package operations

/**
 * Программа демонстрирует основные арифметические операции
 */

fun main(args: Array<String>) {
    val a = 1 +1
    val b = a * 2
    val c = b / 4
    val d = c - a
    val e = -d

    val da: Double = 1.0 + 1.0
    val db = da * 3
    val dc = db / 4
    val dd = dc - a
    val de = -dd

    println("Целочисленная арифметика")
    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
    println("e = $e")

    println("\nАрифметика с плавающей точкой")
    println("da = $da")
    println("db = $db")
    println("dc = $dc")
    println("dd = $dd")
    println("de = $de")
}
