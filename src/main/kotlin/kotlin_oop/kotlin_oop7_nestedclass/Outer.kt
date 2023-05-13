package kotlin_oop.kotlin_oop7_nestedclass

class Outer {
    //Nested Class
    //In a nested class, the inner class cannot access
    //the properties and behaviors of the Outer class

        val outerClassName = "Outer name"

        class Inner{
            fun callOuter(){
                println("Not Possible")
            }
        }

}