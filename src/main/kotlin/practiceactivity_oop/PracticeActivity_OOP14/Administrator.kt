package practiceactivity_oop.PracticeActivity_OOP14

class Administrator(name:String, age:Int, role:String, var department:String):Employee(name, age, role) {
    override fun displayInfo() {
        super.displayInfo()
        println("Department: $department")
    }
}