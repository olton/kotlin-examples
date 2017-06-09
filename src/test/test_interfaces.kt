package test

interface I1 {
    fun bar()
}

interface I2 {
    fun foo(): Int
}

interface II: I1, I2 {
    override fun bar()
    override fun foo(): Int
}

class C1: II {
    override fun bar() {}
    override fun foo(): Int {
        return 0
    }
}

