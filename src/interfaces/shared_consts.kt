package interfaces

import java.util.Random

interface SharedConsts {
    val NO get() = 1
    val YES get() = 2
    val MAYBE get() = 3
}

class Question: SharedConsts {
    val rand = Random()
    fun ask(): Int {
        val prob: Int = rand.nextInt(100)

        when (prob) {
            in 0..33 -> return NO
            in 34..67 -> return YES
            else -> return MAYBE
        }
    }
}

class AskMe: SharedConsts {
    fun answer(res: Int) {
        when(res) {
            NO -> println("НЕТ")
            YES -> println("ДА")
            else -> println("ВОЗМОЖНО")
        }
    }
}

fun main(args: Array<String>){
    val q = Question()
    val a = AskMe()
    a.answer(q.ask())
    a.answer(q.ask())
    a.answer(q.ask())
    a.answer(q.ask())
    a.answer(q.ask())
}