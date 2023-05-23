package practiceactivity_oop.PracticeActivity_OOP16

class Motorcycle(private val brand:String , private val year:Int):Vehicle(brand , year) {
    override fun start() {
        println("The Motorcycle is starting.....")
    }

    override fun stop() {
        println("The Motorcycle is stopping.....")
    }

    override fun accelerate() {
        println("The Motorcycle is accelerating.....")
    }

    override fun brand() {
        println("The Motorcycle brand is $brand")
    }

    override fun year() {
        println("The Motorcycle year model is $year")
    }
}