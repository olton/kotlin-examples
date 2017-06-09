package interfaces

interface Callback2 {
    fun callback(param: Int)
}

abstract class AbstractClient: Callback2 {
    fun show() {
        println("Этот клас должен быть объявлен как абстрактный")
    }
}