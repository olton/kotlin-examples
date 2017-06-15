package classes

open class A {
    open val i: Int = 1
    open fun show(){
        println("Функция show() сеперкласса")
    }
}

class B: A() {
    override val i: Int = 2

    override fun show(){
        super.show()
        println("Функция show() подкласса")
        println("Член i в суперклассе: ${super.i}")
        println("Член i в подклассе: ${this.i}")
    }
}

fun main(args: Array<String>){
    val c = B()
    c.show()
}