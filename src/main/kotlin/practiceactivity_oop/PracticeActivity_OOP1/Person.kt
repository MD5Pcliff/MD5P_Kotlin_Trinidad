package practiceactivity_oop.PracticeActivity_OOP1
//Create a class called Person with properties name, age, and email. add a function called
//printDetails that prints out the person's name age and email
class Person(var name:String, var age:Int, var email:String) {

    fun printDetails(){
        println("The name is $name")
        println("$age years of age")
        println("with email address at $email")
    }
}