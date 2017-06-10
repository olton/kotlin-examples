package exceptions

class MyException (val detail: Int): Exception() {
    override fun toString(): String {
        return "Мое исключение [$detail]"
    }
}

fun main(args: Array<String>){
    fun compute(a: Int) {

        println("Вызван метод compute($a)")

        if (a > 10)
            throw MyException(a)

        println("Нормальное завершение")
    }

    try {
        compute(1)
        compute(20)
    } catch (e: MyException) {
        println("Перехвачено исключение: $e")
    }
}