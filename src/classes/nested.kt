package classes

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }
}

fun main(args: Array<String>){
    println("Значение из вложенного класса: ${Outer.Nested().foo()}")
    println("Значение из внутреннего класса: ${Outer().Inner().foo()}")
}