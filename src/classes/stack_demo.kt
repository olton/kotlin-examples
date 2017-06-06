package classes

/**
 * Пример StackDemo
 * Пример программы работы с классом Stack
 */
fun main(args: Array<String>){
    val size = 5
    val stack = Stack(size)
    for (i in 0..size - 1)
        stack.push(i)

    println("Содержимое стека:")
    for (i in 0..size - 1)
        println(stack.pop())
}
