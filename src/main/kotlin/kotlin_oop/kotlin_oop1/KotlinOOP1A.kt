package kotlin_oop.kotlin_oop1
//Structural Programming - Procedural Programming. Top to Bottom
//OOP - Object-Oriented Programming
//Objects - represent something in the real world
//Class - blueprint of an object
//Person class
//Attributes/Properties - noun
//name
//age
//address
//phone number
//gender
//birthday
//blood type
//civil status
//Behaviors - verb
//walk
//eat
//sleep
//drive
//study
class Person{
    //attributes
    var name :String
    var age :Int

    //init block, initialization
    init {
        name = "Pedro"
        age = 21
    }
    //Behaviors
    fun walk(){
        println("A person walks")
    }
    fun eat(){
        println("A person eats")
    }
    fun sayHello(){
        println("$name says Hello!")
    }

}
fun main (){
    //instantiation - creating objects from a class
    var pedroObject = Person()
    println(pedroObject.name)
//    pedroObject.name = "Peter"
//    println(pedroObject.name)
    pedroObject.sayHello()
}
