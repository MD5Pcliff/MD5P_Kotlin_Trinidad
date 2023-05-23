package practiceactivity_oop.PracticeActivity_OOP18

class Rectangle(private val l:Double , private val w:Double):Shape {
    override fun area(): Double {
        return l * w
    }

    override fun perimeter(): Double {
        return 2 * (l * w)
    }
}