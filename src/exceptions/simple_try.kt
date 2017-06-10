package exceptions

fun main(args: Array<String>){
    val d = 0
    var a: Int = 0

    try {
        a = 42 / d
    } catch (e: ArithmeticException) {
        println("Деление на нуль")
    }

    println("Жизнь после оператора catch")
}
