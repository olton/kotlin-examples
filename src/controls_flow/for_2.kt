package controls_flow

/**
 * Created by Sergey Pimenov on 03.06.2017.
 * Пример программы демонстрирующей оператор break
 */
fun main(args: Array<String>){
    for (i in 0..3) {
        print("Проход $i: ")
        for (j in 0..99) {
            if (j == 10) break
            print("$j ")
        }
        println()
    }
    println("Циклы завершены")
}
