package controls_flow

/**
 * Программа демонстрирует работу цикла do-while
 */
fun main(args: Array<String>){
    var n = 10
    do {
        println("Такт №$n")
    } while (--n > 0)
}
