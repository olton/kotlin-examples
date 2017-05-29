/**
 * Пример программы работы со строками. Программа выводит символ и код символа
 */

fun main(args: Array<String>){
    val text = "This is a string"

    for(c in text) {
        print("$c[${c.toInt()}] ")
    }

    println()
    println("The" + " end")
}