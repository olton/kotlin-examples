package exceptions

fun main(args: Array<String>){
    val a = args.size
    var b: Int = 0
    val c: IntArray = intArrayOf(1)
    try {
        println("a = $a")
        b = 42/ a
        c[42] = 99
    }
    catch (e: ArithmeticException) {
        println("Деление на нуль: " + e)
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("Индекс за пределами массива: " + e)
    }

    println("Жизнь после try/catch")
}