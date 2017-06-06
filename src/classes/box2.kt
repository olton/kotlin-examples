package classes

class Box2 (val width: Int, val height: Int, val depth: Int)

fun main(args: Array<String>){
    var vol: Int
    val box1 = Box2(10, 20, 15)
    val box2 = Box2(20, 40, 20)

    vol = box1.width * box1.height * box1.depth
    println("Объекм box1 равен $vol")

    vol = box2.width * box2.height * box2.depth
    println("Объекм box2 равен $vol")
}

