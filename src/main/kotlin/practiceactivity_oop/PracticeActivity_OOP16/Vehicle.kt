package practiceactivity_oop.PracticeActivity_OOP16

abstract class Vehicle(private var brand:String , private var year:Int) {
    abstract fun brand()
    abstract fun year()
    abstract fun start()
    abstract fun stop()
    abstract fun accelerate()
}