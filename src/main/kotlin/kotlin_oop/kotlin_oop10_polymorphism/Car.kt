package kotlin_oop.kotlin_oop10_polymorphism

class Car(brand:String, model:String, year:Int) : Vehicle(brand, model, year) {
    fun refuel(){
        println("refueling")
    }
    //Polymorphism - Many forms
    //function over riding
    override fun accelerate(){
        super.accelerate()
        println("A car accelerates!!")
    }
    //function overloading
    fun accelerate(speed:Double){
        println("acceleration speed is $speed")
    }
}