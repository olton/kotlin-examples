package classes

open class GenSuperClass<T>

class GenSubClass<T> : GenSuperClass<T>()
class GenSubClass2<T, V>(val a: T, b: V) : GenSuperClass<T>()

open class MyClass

class GenSubClass3<T>: MyClass()


fun main(args: Array<String>){
    val c = GenSubClass<Int>()
}