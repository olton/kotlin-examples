package test

fun main(args: Array<String>){
    try {
        val d = 0
        val a = 42 / d

        println("Значение а равно $a")
    } catch (e: RuntimeException) {
        print(e.javaClass)
    }
}