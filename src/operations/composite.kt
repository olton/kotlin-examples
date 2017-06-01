package operations

/**
 * Программа демонстрирует работу составных операций
 */
fun main(args: Array<String>){
    var  a = 5
    var  b = 5
    var  c = 5
    var  d = 5
    var  e = 5

    a += 5
    b -= 5
    c /= 5
    d *= 5
    e %= 5

    println("a += 5 будет $a")
    println("b -= 5 будет $b")
    println("c /= 5 будет $c")
    println("d *= 5 будет $d")
    println("e %= 5 будет $e")

}