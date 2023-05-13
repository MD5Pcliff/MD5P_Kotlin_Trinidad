package practiceactivity_oop.PracticeActivity_OOP6
fun main(){
    println("First Constructor")
    var shape1 = Shape()
    println("Length = ${shape1.length}")
    println("Width = ${shape1.width}")

    println("Second Constructor")
    var shape2 = Shape(5, 6)
    println("Length = ${shape2.length}")
    println("Width = ${shape2.width}")
}