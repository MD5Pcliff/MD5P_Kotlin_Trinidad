package kotlin_oop.kotlin_oop6_innerclass

class Outer {
    val outerClassName = "Outer name"

    inner class Inner(){
        fun callOuter(){
            println(outerClassName)
        }
    }
}