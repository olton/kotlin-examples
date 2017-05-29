/**
 * Пример программы, которая создает двумерный массив
 */
fun main(args: Array<String>){
    val one: IntArray = intArrayOf(1, 2, 3)
    val two: IntArray = intArrayOf(4, 5, 6)
    val three: IntArray = intArrayOf(7, 8, 9)
    val a2d: Array<IntArray> = arrayOf(one, two)
    val a3d: Array<Array<IntArray>> = arrayOf(arrayOf(one, two, three))

    println("Print 2d array")
    for (i in a2d) {
        for (j in i) {
            print(j)
        }
        println()
    }

    println("Print 3d array")
    for (i in a3d) {
        for (j in i) {
            for (k in j) {
                print(k)
            }
            println()
        }
        println()
    }
}