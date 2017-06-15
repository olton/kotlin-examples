package classes

class DestructuringClass(val name: String, val age: Int) {
    operator fun component1(): String{
        return name
    }

    operator fun component2(): Int{
        return age
    }
}

fun main(args: Array<String>){
    val c = DestructuringClass("Петя", 25)
    val (name, age) = c

    println("Деструктуризация объекта")
    println("Значение name: $name")
    println("Значение age: $age")
}