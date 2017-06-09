package interfaces

interface Callback {
    fun callback(param: Int)
}

class Client: Callback {
    override fun callback(param: Int){
        println("Метод callback() вызван со значением $param")
    }

    fun nonIFaceMethod() {
        println("В классах, реализующих интерфесы, могут определяться и другие методы")
    }
}

fun main(args: Array<String>){
    val cli = Client()
    val cli2: Callback = Client()

    cli.callback(123)
    cli.nonIFaceMethod()

    cli2.callback(321)
    //cli2.nonIFaceMethod()
}