package interfaces

class A {
    public interface NestedIF {
        fun bar()
    }
}

class B: A.NestedIF {
    override fun bar(){
        println("Пример вложенного интерфейса")
    }
}

fun main(args: Array<String>){
    val b = B()
    b.bar()
}