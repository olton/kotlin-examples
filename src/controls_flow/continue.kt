package controls_flow

/**
 * Created by Sergey Pimenov on 03.06.2017.
 * Программа демонстрирует применение оператора continue
 */
fun main(args: Array<String>){
    for (i in 0..9) {
        print("$i ")
        if ( i % 2 == 0) continue
        println()
    }
}
