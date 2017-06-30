package classes

class MouseEvent

interface MouseAdapter {

    fun onMouseClicked(e: MouseEvent) {
    }

    fun onMouseEntered(e: MouseEvent) {
    }
}

class Window {

    val mouseListeners: List<MouseAdapter> = listOf()

    fun addMouseListener(listener: MouseAdapter) {
        mouseListeners + listener
    }
}

fun countClicks(window: Window) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter {
        override fun onMouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun onMouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
}

open class AA(x: Int) {
    open val y: Int = x
}

interface BB

fun main(args: Array<String>){

    val window = Window()
    window.addMouseListener(object : MouseAdapter {
        override fun onMouseClicked(e: MouseEvent) {
            println("Mouse clicked")
        }

        override fun onMouseEntered(e: MouseEvent) {
            println("Mouse entered")
        }
    })

    countClicks(window)

    val ab = object : AA(1), BB {
        override val y: Int = 15
    }

    println("ab.y: ${ab.y}")

    val adHoc = object {
        val x = 1
        val y = 2
    }
    println("${adHoc.x} + ${adHoc.y}")
}