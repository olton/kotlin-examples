package annotations

import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

@Retention(AnnotationRetention.RUNTIME)
annotation class MyAnno(val src: String)

@MyAnno("Это аннотация для класса") class MyAnnoClass {
    @MyAnno("Это аннотация для свойства") val property = 1
}

fun main(args: Array<String>){
    val c = MyAnnoClass()
    val m = c::class
    val p = m.memberProperties
    val a = m.findAnnotation<MyAnno>()

    println(m.annotations)
    p.map {
        println(it.annotations)
    }
    println(a)
}
