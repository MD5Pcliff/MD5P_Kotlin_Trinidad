package practiceactivity_oop.PracticeActivity_OOP16

class Car(private val brand:String , private val year:Int):Vehicle(brand, year) {
    override fun start() {
        println("The Car is starting.....")
    }

    override fun stop() {
        println("The Car is stopping.....")
    }

    override fun accelerate() {
        println("The Car is accelerating.......")
    }

    override fun brand() {
        println("The Car brand is $brand")
    }

    override fun year() {
        println("The Car year model is $year")
    }
}