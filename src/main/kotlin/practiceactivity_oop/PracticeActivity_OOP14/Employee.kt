package practiceactivity_oop.PracticeActivity_OOP14

open class Employee(var name:String , var age:Int , var role:String){
    open fun displayInfo(){
        println("Employee's name: $name")
        println("Employee's age: $age")
        println("Employee's role: $role")
    }
}