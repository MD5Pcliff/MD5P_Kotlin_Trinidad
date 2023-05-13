package practiceactivity_oop.PracticeActivity_OOP7


fun main(){
    println("First Constructor")
    var person1 = Person()
    println("Name = ${person1.name}")
    println("age = ${person1.age}")

    println("Second Constructor")
    var person2 = Person("Clifford", 21)
    println("Name = ${person2.name}")
    println("age = ${person2.age}")
}