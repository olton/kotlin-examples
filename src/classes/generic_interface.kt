package classes

interface MinMax<T: Comparable<T>> {
    fun min(): T
    fun max(): T
}

class GenClass<T: Comparable<T>>(val vals: Array<T>): MinMax<T> {
    override fun min(): T {
        var v = vals[0]
        (0..vals.size-1).forEach { i -> if (vals[i] < v) v = vals[i] }
        return v
    }

    override fun max(): T {
        var v = vals[0]
        (0..vals.size-1).forEach { i -> if (vals[i] > v) v = vals[i] }
        return v
    }
}

fun main(args: Array<String>){
    val iob = GenClass(arrayOf(3, 6, 2, 8, 6))
    val cob = GenClass(arrayOf('b', 'r', 'p', 'w'))

    println("Максимум в массиве iob: ${iob.max()}")
    println("Минимум в массиве iob: ${iob.min()}")
    println("Максимум в массиве cob: ${cob.max()}")
    println("Минимум в массиве cob: ${cob.min()}")
}