package practiceactivity_oop.PracticeActivity_OOP14
fun main(){
    var person = Employee("Cliff", 25 , "Admin")
    println(person.displayInfo())
    println()


    person = Teacher("Goku", 50 , "Teacher" , "Physical Education")
    println(person.displayInfo())
    println()


    person = Administrator("Mae", 60, "Admin" , "Accounting")
    println(person.displayInfo())
    println()
}