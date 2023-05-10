package kotlin_oop.kotlin_oop1
class PersonC(var name:String, var age:Int){

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
    var pedroObject = PersonC("Ringo" , 21)
    println(pedroObject.name)
    println(pedroObject.age)
//    pedroObject.name = "Peter"
//    println(pedroObject.name)
    pedroObject.sayHello()
}
