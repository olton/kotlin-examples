package exceptions

fun demoChains(cause: String){
    val e = NullPointerException()
    e.initCause(ArithmeticException(cause))
    throw e
}

fun main(args: Array<String>){
    try {
        demoChains("Марс атакует")
    } catch (e: NullPointerException) {
        println("Перехвачено исключение: $e")
        println("Причиной стало: " + e.cause)

    }
}