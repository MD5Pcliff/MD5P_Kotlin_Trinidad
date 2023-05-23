package practiceactivity_oop.PracticeActivity_OOP16

fun main(){
    val vehicle1 =  Car("Toyota" , 2023)
    vehicle1.brand()
    vehicle1.year()
    vehicle1.start()
    vehicle1.accelerate()
    vehicle1.stop()
    println()

    val vehicle2 = Motorcycle("Honda" , 2022)
    vehicle2.brand()
    vehicle2.year()
    vehicle2.start()
    vehicle2.accelerate()
    vehicle2.stop()

}