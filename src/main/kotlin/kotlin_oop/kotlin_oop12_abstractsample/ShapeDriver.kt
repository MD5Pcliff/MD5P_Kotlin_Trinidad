package kotlin_oop.kotlin_oop12_abstractsample
fun main(){
    val rectangle = Rectangle(5.0 , 3.0)
    println("Rectangle Area: ${rectangle.area()}")
    println("Rectangle Perimeter: ${rectangle.perimeter()}")
    println()
    val circle = Circle(2.5)
    println("Circle Area: ${circle.area()}")
    println("Circle Perimeter: ${circle.perimeter()}")

}