package exceptions


fun main(args: Array<String>){

    class ThrowDemo {
        fun proc() {
            try {
                throw NullPointerException("Демо NPE")
            } catch (e: NullPointerException) {
                println("Исключение перехвачено в демо классе в методе")
                throw e
            }
        }
    }

    try {
        ThrowDemo().proc()
    } catch (e: NullPointerException) {
        println("Повторный перехват NPE")
    }
}