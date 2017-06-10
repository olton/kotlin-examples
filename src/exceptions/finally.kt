package exceptions

fun main(args: Array<String>){
    val d = 0
    var a: Int = 0

    try {
        a = 42 / d
    } catch (e: Exception) {
        println("Мы перехватили исключение")
    }
    finally {
        println("Жизнь после оператора finally")
    }
    println("Жизнь после оператора try/catch")
}

