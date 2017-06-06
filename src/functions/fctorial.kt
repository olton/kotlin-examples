package functions

fun fact(n: Long): Long {
    if (n <= 0) {
        return 0
    } else if (n.toInt() == 1) {
        return 1
    } else {
        return n * fact(n - 1)
    }
}

fun printResult(n: Long, r: Long) {
    println("Факториал числа $n равен $r")
}

fun main(args: Array<String>){
    var result: Long
    for (i in 0..5) {
        result = fact(i.toLong())
        printResult(i.toLong(), result)
    }
}