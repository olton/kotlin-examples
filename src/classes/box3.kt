package classes

class Box3 (val width: Int, val height: Int, val depth: Int) {
    fun volume() : Int {
        return width * height * depth
    }
}

fun main(args: Array<String>){
    val vol: Int
    val box = Box3(10, 20, 15)

    vol = box.volume()
    println("Объекм равен $vol")
}

