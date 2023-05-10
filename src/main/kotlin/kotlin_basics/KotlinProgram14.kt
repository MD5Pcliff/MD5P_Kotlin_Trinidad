package kotlin_basics

fun main(){
    //Program Description
    //This is a program that can register student profile
    //Compute the grades
    var selection : Int = 0
    println("Please Enter Selection:")
    println("[1] Register Student")
    println("[2] Compute Grade")

    selection = readln().toInt()


    when(selection){
        //register student
        1 -> {
            println("Student Registration!")
            println("Enter Name:")
            var name :String = readln()
            println("Enter Course:")
            var course :String = readln()

            println("Do you want to register $name with course $course")
            var response :String = readln()
            if(response == "Yes" || response == "yes"){
                println("Registered Successfully!")

            }else{
                println("Registration Failed!")
            }
        }
        2 -> {
            println("Studend Grade Computation!")
            println("Enter Grade 1:")
            var grade1 :Int = readln().toInt()
            println("Enter Grade 2:")
            var grade2 :Int = readln().toInt()
            println("Enter Grade 3:")
            var grade3 :Int = readln().toInt()

            var gradeAverage = (grade1 + grade2 + grade3)/3

            if(gradeAverage > 74){
                println("Passed")

            }else{
                println("Failed")
            }
        }
    }
}