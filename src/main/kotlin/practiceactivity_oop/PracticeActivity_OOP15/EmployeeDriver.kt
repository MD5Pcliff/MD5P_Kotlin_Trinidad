package practiceactivity_oop.PracticeActivity_OOP15
fun main(){
    val employee1 = FullTimeEmployee("Cliff", 10000)
    println("Full Time Employee")
    println("Employee's Name: ${employee1.name()}")
    println("Employee's Salary: ${employee1.salary()}")
    println()

    val employee2 = PartTimeEmployee("Sven" , 5000)
    println("Part Time Employee")
    println("Employee's Name: ${employee2.name()}")
    println("Employee's Salary: ${employee2.salary()}")
}