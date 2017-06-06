package controls_flow

/**
 * Created by Sergey Pimenov on 03.06.2017.
 * Пример программы, демонстрирующей работу оператора break
 */
fun main(args: Array<String>){
    for (i in 0..100) {
        if (i == 10) break
        println("i: $i")
    }
    println("Цикл завершен оператором break")
}
