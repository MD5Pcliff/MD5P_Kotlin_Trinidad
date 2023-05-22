package practiceactivity_oop.PracticeActivity_OOP15

class FullTimeEmployee(private val name:String , private val salary:Int):Employee() {
    override fun name():String {
        return name
    }

    override fun salary(): Int {
        return salary
    }
}