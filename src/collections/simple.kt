package collections

fun main(args: Array<String>){
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers

    println(numbers)
    numbers.add(4)
    println(readOnlyView)

    val strings = hashSetOf("a", "b", "c", "c")
    assert(strings.size == 3)
    println(strings)

    val num: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (n in num) {
        print(n)
    }

    println()
    num.forEach {
        print(it)
    }
    println()
    num.map {
        print(it)
    }
}
