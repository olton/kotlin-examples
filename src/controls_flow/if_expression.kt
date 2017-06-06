package controls_flow

/**
 * Пример программы для выражения if
 */
fun main(args: Array<String>){
    val a = 1
    val b = 2
    var max: Int

    // простой if
    max = a
    if (a < b) max = b

    println("Большее зничение $max")

    // if else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Большее зничение $max")

    // if как выражение
    max = if (a > b) a else b
    println("Большее зничение $max")

    max = if (a > b) {
        println("возвращаем a")
        a
    } else {
        println("возвращаем b")
        b
    }
    println("Большее зничение $max")

    max = if (a > 0)

        if (b > 0)
            1
        else
            2
    else
        3
    println("Зничение $max")

    max = if (a > 0)
        1
    else if (a < 0)
        2
    else
        3
    println("Зничение $max")
}