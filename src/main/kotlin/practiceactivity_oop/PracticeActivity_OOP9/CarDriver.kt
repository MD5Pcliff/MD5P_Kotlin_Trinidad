package practiceactivity_oop.PracticeActivity_OOP9

fun main(){
    println("First Constructor")
    var car1 = Car()
    println("${car1.make} - ${car1.model} - ${car1.year}")

    println("Second Constructor")
    var car2 = Car("Toyota","Rush", 2019)
    println("${car2.make} - ${car2.model} - ${car2.year}")
}