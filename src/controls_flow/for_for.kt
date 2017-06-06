package controls_flow

/**
 * Программа демонстрирует работу цикла for
 */
fun main(args: Array<String>){
    val i: Int = 0
    val j: Int

    for (i in 0..10) {
        for (j in i..10) {
            print(".")
        }
        println()
    }
}