package classes

interface IGen<T>

data class Gen<out T> (val t: T) {
    fun showT() : T {
        return t
    }
}

class GenTwo<T, V>(a: T, b: V) {
    var t: T = a
    var v: V = b
}

class GenLim<T: Number> {

    private var value: Double

    constructor (arg: T) {
        value = arg.toDouble()
    }

    fun showVal(): Double {
        return value
    }
}

class Stats<T: Number>(val nums: Array<T>) {
    fun avg(): Double {
        var sum = 0.0
        for (i in 0..nums.size-1)
            sum += nums[i].toDouble()
        return sum / nums.size
    }

    fun sameAvg(s: Stats<Double>): Boolean {
        return avg() == s.avg()
    }
}

abstract class GenLimitTwo<T>: Comparable<T>, IGen<T>

fun main(args: Array<String>){
    val a = Gen<Int>(100)
    val b = Gen<Double>(100.0)
    val c = Gen<String>("Привет")
    val d = GenLim(200)

    println("Тип для a: " + a.t::class.java.simpleName + " значение t: ${a.showT()}")
    println("Тип для b: " + b.t::class.java.simpleName + " значение t: ${b.showT()}")
    println("Тип для c: " + c.t::class.java.simpleName + " значение t: ${c.showT()}")

    val aTwo = GenTwo(1, "Привет")
    println("Тип для aTwo.t: " + aTwo.t::class.java.simpleName)
    println("Тип для aTwo.v: " + aTwo.v::class.java.simpleName)

    val inums = Stats(arrayOf(1, 2, 3, 4, 5))
    val dnums = Stats(arrayOf(1.0, 2.2, 3.3, 4.4, 5.5))

    println("Avg inums = " + inums.avg())
    println("Avg bnums = " + dnums.avg())
    println("Avg inums = dnums is " + inums.sameAvg(dnums))

    println("Значение d: ${d.showVal()}")
}