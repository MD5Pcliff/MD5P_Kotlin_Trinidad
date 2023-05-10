package practiceactivity_oop.PracticeActivity_OOP5

class Student(var name:String, var age:Int , var grade:Int) {
    fun promote(){
        grade++
        println("Student new grade is $grade")
    }

}