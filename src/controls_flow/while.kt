package controls_flow

/**
 * Created by Sergey Pimenov on 03.06.2017.
 * Программа проверяет, является ли число простым
 * Программа демонстрирует цикл while
 */
fun main(args: Array<String>){
    val num: Int = 13
    var isPrime: Boolean
    var i: Int = 2

    isPrime = num >= 2

    while(i < num / i) {
        if ((num % i) == 0) {
            isPrime = false
            break
        }
        i++
    }

    println("Число $num " + (if (isPrime) "простое" else "не простое"))
}