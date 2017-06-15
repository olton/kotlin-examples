package classes

// Kotlin 1.1

sealed class Car2
data class Maruti(val speed: Int) : Car2()
data class Bugatti(val speed: Int, val boost: Int) : Car2()
object NotACar : Car2()

fun speed(car: Car2): Int = when (car) {
    is Maruti -> car.speed
    is Bugatti -> car.speed + car.boost
    NotACar -> 0
}

fun main(args: Array<String>){
    val m = Maruti(200)
    val b = Bugatti(250, 100)
    val n = NotACar

    println("Maruti speed: " + speed(m))
    println("Bugatti speed: " + speed(b))
    println("UFO speed: " + speed(n))
}