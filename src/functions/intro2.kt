package functions

fun checkPass(user_pass: String?): Unit {
    val valid_pass = "qwerty"
    if (user_pass == valid_pass) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}

fun main(args: Array<String>){
    val user_pass: String?

    print("Введите пароль: ")
    user_pass = readLine()

    checkPass(user_pass)

    /*
    * ...Некий длинный код и повторная проверка
    */

    checkPass(user_pass)
}