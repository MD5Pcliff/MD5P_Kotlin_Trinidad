package kotlin_oop.kotlin_oop10_polymorphism

open class Vehicle (private val brand:String, private val model:String, private val year:Int){
    open fun accelerate(){
        println("A vehicle accelerates")
    }
    fun brake(){
        println("breaks are applied")
    }
    fun displayInfo(){
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
    }
}