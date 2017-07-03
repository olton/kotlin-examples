package classes

interface IStack<T> {
    fun push(item: T)
    fun pop(): T?
}

class Stack2<T>(val size: Int = 10): IStack<T> {

    @Suppress("UNCHECKED_CAST")
    private val stck = arrayOfNulls<Any>(size) as Array<T>
    private var tos: Int = -1

    override fun push(item: T) {
        if (tos == size - 1)
            println("Стек заполнен")
        else
            stck[++tos] = item
    }

    override fun pop(): T? {
        if (tos < 0) {
            println("Стек пуст")
            return null
        }

        return stck[tos--]
    }
}

fun main(args: Array<String>){
    val size = 5
    val stackInt = Stack2<Int>(size)
    val stackChar = Stack2<Char>(size)

    println("Целочисленный стек: ")
    for (i in 0..size - 1)
        stackInt.push(i)

    for (i in 0..size - 1)
        print(" " + stackInt.pop())

    println()

    println("Символьный стек: ")
    for (i in 0..size - 1)
        stackChar.push((i + 65).toChar())

    for (i in 0..size - 1)
        print(" " + stackChar.pop())

    println()
}

