package practiceactivity_oop.PracticeActivity_OOP2

class Rectangle(var length:Int , var width:Int) {
    fun calculateArea(){
        var area = length * width
        println("The area is $area")
    }
}