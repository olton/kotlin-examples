package classes

fun main(args: Array<String>){
    println("Яблоко ${Apple.RedDel} имеет цвет: " + Apple.RedDel.appleColor())

    for (apple in Apple.values()) {
        println("Яблоко $apple имеет цвет: " + apple.appleColor())
    }
}