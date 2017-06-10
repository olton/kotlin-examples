package exceptions

fun main(args: Array<String>){
    try {
        var a = args.size
        val b = 42 / a

        println("a = $a")
        println("b = $b")

        try {
            if (a == 1) a /= (a - a)
            if (a == 2) {
                val c = arrayOf(1)
                c[42] = 99
            }
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("Индекс за пределами массива: " + e)
        }
    }
    catch (e: ArithmeticException) {
        println("Деление на нуль: " + e)
    }
}