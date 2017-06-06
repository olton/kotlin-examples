package functions

fun main(args: Array<String>){
    val valid_pass = "qwerty"
    val user_pass: String?

    print("Введите пароль: ")
    user_pass = readLine()

    if (user_pass == valid_pass) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }

    /*
    * ...Некий длинный код и повторная проверка
    */

    if (user_pass == valid_pass) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}