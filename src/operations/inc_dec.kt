package operations

/**
 * Программа демонстрирует применение операций инкремента и декремента
 */
fun main(args: Array<String>){
    var a = 1
    var b: Int

    println("Значение а равно $a")

    a++
    println("Выполняем a++ теперь а равно $a")

    a--
    println("Выполняем a-- теперь а равно $a")

    b = a++
    println("Выполняем b = a++ теперь b равно $b а равно $a")

    b = ++a
    println("Выполняем b = ++a теперь b равно $b а равно $a")

    b = a--
    println("Выполняем b = a-- теперь b равно $b а равно $a")

    b = --a
    println("Выполняем b = --a теперь b равно $b а равно $a")
}
