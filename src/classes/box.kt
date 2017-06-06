package classes

class Box (val width: Int, val height: Int, val depth: Int)

fun main(args: Array<String>){
    val vol: Int
    val box = Box(10, 20, 15)
    vol = box.width * box.height * box.depth
    println("Объекм равен $vol")
}

