package practiceactivity_oop.PracticeActivity_OOP18

fun main(){
    val s1 = Circle(15.00)
    var a = s1.area()
    var p = s1.area()
    println("The area of the Circle is $a")
    println("The circumference of the Circle is $p")
    println()

    val s2 = Rectangle(2.00 ,5.00)
    a = s2.area()
    p = s2.perimeter()
    println("The area of the Rectangle is $a")
    println("The perimeter of the Rectangle is $p")
}