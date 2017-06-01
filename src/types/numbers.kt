package types

fun main(args: Array<String>) {
    val lightSpeed: Long = 186000
    val days: Long = 1000
    val seconds: Long = days * 24 * 60 * 60
    val distance: Long  = lightSpeed * seconds

    println("За $days дней свет пройдет около $distance миль.")
}