package practiceactivity_oop.PracticeActivity_OOP18

class Circle(private val rad:Double) :Shape {
    override fun area():Double {
        return Math.PI * rad * rad
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * rad
    }
}