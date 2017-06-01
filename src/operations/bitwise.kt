package operations

/**
 * Программа демонстрирует поразрядные операции
 */
fun main(args: Array<String>){
    val x: Int = 42
    val y: Int = 15
    val r: Int = 64
    val z: Int = -1

    println("Выполнение операции x.inv() равно ${x.inv()}")
    println("Выполнение операции x and y равно ${x and y}")
    println("Выполнение операции x or y равно ${x or y}")
    println("Выполнение операции x xor y равно ${x xor y}")
    println("Выполнение операции r shl 2 равно ${r shl 2}")
    println("Выполнение операции z ushr 24 равно ${z ushr 24}")
}