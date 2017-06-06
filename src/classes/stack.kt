package classes

class Stack(var size: Int = 10) {
    private val stck = IntArray(size)
    private var tos: Int = -1

    // Разместить элемент в стеке
    fun push(item: Int) : Unit {
        if (tos == size - 1)
            println("Стек заполнен")
        else
            stck[++tos] = item
    }

    // Извлечь элемент из стека
    fun pop(): Int {
        if (tos < 0) {
            println("Стек пуст")
            return 0
        }

        return stck[tos--]
    }
}