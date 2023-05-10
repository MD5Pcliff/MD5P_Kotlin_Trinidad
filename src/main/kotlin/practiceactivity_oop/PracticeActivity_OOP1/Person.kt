package practiceactivity_oop.PracticeActivity_OOP1

class Person(var name:String, var age:Int, var email:String) {

    fun printDetails(){
        println("The name is $name")
        println("$age years of age")
        println("with email address at $email")
    }
}