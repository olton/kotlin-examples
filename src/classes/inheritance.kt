package classes

open class ClassA {
    val a = 1
    override fun toString(): String {
        return "I'am ClassA [$a]"
    }
}
class ClassB: ClassA() {
    val b = 2
    override fun toString(): String {
        return "I'am ClassB [$b]"
    }
}

fun main(args: Array<String>){
    var c = ClassA()
    val b = ClassB()

    println(c)
    println(c.a)

    c = b

    println(c)
    println(c.b)
}

