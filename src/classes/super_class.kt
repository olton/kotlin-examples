package classes

open class SuperA (val i: Int, val j: Int) {
    open fun show(){
        println("i и j: $i, $j")
    }
}

class ExtB(val k: Int): SuperA(5, 6) {
    override fun show(){
        super.show()
        println("k: $k")
        println("Сумма всех значений i + j + k: ${i + j + k}")
    }
}

fun main(args: Array<String>){
    val c = ExtB(7)
    c.show()
}