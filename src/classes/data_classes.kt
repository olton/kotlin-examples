package classes

data class Customer(val name: String, val age: Int)

fun main(args: Array<String>){
    val a = Customer("Петя", 25)
    val c = Customer("Вася", 25)
    val b: Customer
    val d: Customer

    println("hasCode: " + c.hashCode())
    println("toString: " + c.toString())

    b = c

    println("B эквивалентен С: " + (b == c))
    println("А эквивалентен В: " + (a == b))

    d = a.copy(age = 30)

    println("А имеет значения: " + a.toString())
    println("D имеет значения: " + d.toString())
}