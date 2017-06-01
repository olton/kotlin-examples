package types

/**
 * Пример программы которая создает массивы и выводит их значения
 */
fun main(args: Array<String>){
    val a = arrayOf(1, 2, 3, 4, 5)
    val b = Array(26, { i -> (i + 65).toChar()})

    for (k in 0..a.size-1) {
        print("${a[k]} ")
    }
    println()

    for (k in b) {
        print("$k ")
    }
    println()
}
