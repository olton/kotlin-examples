package classes

interface IAppleColor {
    fun appleColor(): String
}

enum class Apple(val color: String): IAppleColor {
    Jonathan("Красный"),
    GoldenDel("Желтый"),
    RedDel("Темно-красный"),
    Winesap("Красно-зеленый"),
    Cortland("Красно-желтый");

    override fun appleColor(): String {
        return color
    }
}

fun main(args: Array<String>){
    val myApple: Apple
    val goldenApple = Apple.GoldenDel
    val apples: Array<Apple> = Apple.values()

    myApple = goldenApple

    val name = when (myApple) {
        Apple.Jonathan -> "Джонатан"
        Apple.GoldenDel -> "Гольден"
        Apple.RedDel -> "Ред Делишес"
        Apple.Winesap -> "Сорт Винный"
        Apple.Cortland -> "Кортлэнд"
    }

    println("Мое любимое яблоко $name имеет более сладкий вкус и ${myApple.color} цвет")

    for (apple in apples) {
        println("Яблоко $apple имеет цвет ${apple.color}")

        if (apple == Apple.Winesap) {
            println("Яблоко $apple имеет кисло-сладкий вкус")
        }
    }
}