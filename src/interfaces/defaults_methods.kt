package interfaces

interface InterfaceWithDefaultMethods {
    fun bar(){
        println("Это выполнился метод по умолчанию")
    }
}

class ClassIDM: InterfaceWithDefaultMethods {
    fun foo(){
        println("Это выполнился метод класса")
    }
}

fun main(args: Array<String>){
    val c = ClassIDM()
    c.bar()
    c.foo()
}