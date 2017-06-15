package classes

abstract class absA {}

open class Base: absA() {
    open fun f() {}
}

abstract class Derived : Base() {
    override abstract fun f()
}

fun main(args: Array<String>){
    val a: absA
    val b = Base()

    a = b

    a.f()
}