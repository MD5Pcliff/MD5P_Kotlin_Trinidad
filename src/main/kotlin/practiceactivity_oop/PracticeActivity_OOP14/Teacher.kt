package practiceactivity_oop.PracticeActivity_OOP14

class Teacher(name:String, age:Int, role:String, var subject:String):Employee(name , age, role) {
    override fun displayInfo() {
        super.displayInfo()
        println("Subject: $subject")
    }

}