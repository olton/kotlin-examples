package classes

// Kotlin 1.0

sealed class Car {
    class Maruti(val speed: Int) : Car()
    class Bugatti(val speed: Int, val boost: Int) : Car()
    object NotACar : Car()
}

fun speed(car: Car): Int = when (car) {
    is Car.Maruti -> car.speed
    is Car.Bugatti -> car.speed + car.boost
    Car.NotACar -> 0
}

fun main(args: Array<String>){
    val m = Car.Maruti(200)
    val b = Car.Bugatti(250, 100)
    val n = Car.NotACar

    println("Maruti speed: " + speed(m))
    println("Bugatti speed: " + speed(b))
    println("UFO speed: " + speed(n))
}