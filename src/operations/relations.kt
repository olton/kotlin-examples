package operations

/**
 * Программа демонстрирует использование операций отношения
 */
fun main(args: Array<String>){
    val a = 1
    val b = 3
    val c = 1L
    val char1 = '1'
    val char2 = '1'
    val char3 = '2'
    val char_equals_result: String

    val number1 = Integer(10)
    val number2 = Integer(10)
    val number3 = number1

    println("Выражение a == b вернет ${a == b}")
    println("Выражение a == c.toInt() вернет ${a == c.toInt()}")
    println("Выражение number1 == number2 вернет " + (number1 == number2))
    println("Выражение number1 === number2 вернет " + (number1 === number2))
    println("Выражение number1 === number3 вернет " + (number1 === number3))
    println("Выражение char1 == char2 вернет " + (char1 == char2))

    if (char1 < char3) {
        println("char1 меньше char3")
    } else {
        println("char1 больше char3")
    }

    char_equals_result = if (char1 == char3) "символы равны" else "символы не равны"
    println("Результат сравнения на равенство char1 и char3: $char_equals_result")
}
