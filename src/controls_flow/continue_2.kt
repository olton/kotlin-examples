package controls_flow

/**
 * Created by Sergey Pimenov on 03.06.2017.
 * Программа демонстрирует применение оператора continue с меткой
 */
fun main(args: Array<String>){
    loop@ for (i in 0..9) {
        for ( j in 0..9 ) {
            if (j > i) {
                println()
                continue@loop
            }
            print(" " + (i * j))
        }
    }
    println()
}
