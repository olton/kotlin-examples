package functions

fun read(b: Array<Byte>, off: Int = 0) {
    for (i in off..b.size-1) {
        println("b[$i] = ${b[i]}")
    }
}

fun main(args: Array<String>){
    val bytes: Array<Byte> = arrayOf(1, 2, 3, 4, 5)
    println("Вызов без параметра по умолчанию")
    read(bytes)

    println("Указаны оба параметра")
    read(bytes, 3)
}
