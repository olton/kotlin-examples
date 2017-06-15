package classes

interface IStack<Any> {
    fun push(item: Any)
    fun pop(): Any?
}

class Stack2(val size: Int = 10): IStack<Any> {

    private val stck = arrayOfNulls<Any>(size)
    private var tos: Int = -1

    override fun push(item: Any) {
        if (tos == size - 1)
            println("Стек заполнен")
        else
            stck[++tos] = item
    }

    override fun pop(): Any? {
        if (tos < 0) {
            println("Стек пуст")
            return 0
        }

        return stck[tos--]
    }
}

fun main(args: Array<String>){
    val size = 5
    val stackInt = Stack2(size)
    val stackChar = Stack2(size)

    print("Целочисленный стек:")
    for (i in 0..size - 1)
        stackInt.push(i)

    println("Содержимое стека:")
    for (i in 0..size - 1)
        println(stackInt.pop())

    print("Символьный стек:")
    for (i in 0..size - 1)
        stackChar.push((i + 65).toChar())

    println("Содержимое стека:")
    for (i in 0..size - 1)
        println(stackChar.pop())
}
