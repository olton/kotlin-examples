package classes

fun <T: Comparable<T>> isIn(a: T, b: Array<T>): Boolean {
    (0..b.size-1).forEach { i -> if (a == b[i]) return true }
    return false
}

fun main(args: Array<String>){
    val nums = arrayOf(1, 2, 3, 4, 5)
    val strs = arrayOf("один", "два", "три", "четыре", "пять")

    if (isIn(2, nums))
        println("Число 2 содержится в массиве nums")
    if (!isIn(7, nums))
        println("Число 7 отсутствует в массиве nums")
    if (isIn("три", strs))
        println("три содержится в массиве strs")
    if (!isIn("восемь", strs))
        println("восемь отсутствует в массиве strs")

    if (isIn<Int>(2, nums))
        println("Число 2 содержится в массиве nums")
}