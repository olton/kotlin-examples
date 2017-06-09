package classes

class OverloadingClass {
    fun method(x: Int) {
        println("Вызван метод для тип Int [$x]")
    }
    fun method(x: Long) {
        println("Вызван метод для тип Long [$x]")
    }
    fun method() {
        println("Вызван метод без паратров")
    }
    fun method(x: Boolean): Boolean {
        println("Вызван метод с return $x")
        return true
    }
}

fun main(args: Array<String>){
    val int = 1
    val long = 1L
    val c = OverloadingClass()
    c.method(int)
    c.method(long)
    c.method()
    c.method(true)
}