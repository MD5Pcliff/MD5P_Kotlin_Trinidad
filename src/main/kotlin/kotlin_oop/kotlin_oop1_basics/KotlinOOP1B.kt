package kotlin_oop.kotlin_oop1_basics
class PersonB(name:String , age:Int){
    //attributes
    var name :String
    var age :Int
    init {
        this.name = name
        this.age = age
    }
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
    var pedroObject = PersonB("Ringo" , 21)
    println(pedroObject.name)
    println(pedroObject.age)
//    pedroObject.name = "Peter"
//    println(pedroObject.name)
    pedroObject.sayHello()
}
