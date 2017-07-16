package operations

data class User(val name: String, val age: Int)

fun main(args: Array<String>){
    val a = Integer(10)
    val b = Integer(10)
    val user1 = User("Вася", 22)
    val user2 = User("Вася", 22)
    val array1 = arrayOf("Hiking, Chess")
    val array2 = arrayOf("Hiking, Chess")

    println ("a == b is ${a == b}")
    println ("a === b is ${a === b}")

    println ("user1 == user2 is ${user1 == user2}")
    println ("user1 === user2 is ${user1 === user2}")

    println ("array1 contentEquals array2 ${array1 contentEquals array2}")
    println ("array1 contentDeepEquals array2 ${array1 contentDeepEquals array2}")
}