fun main() {

        var age: Int = 0
        //18 Up will display , 18 below will not display
        // < > <= >= == !=
        println("Please Enter Age:")
        age = readln().toInt()

        if (age >= 18) {

            println("Your age is $age")
            println("You are qualified to vote")
        } else {
            println("Your age is $age")
            println("You are not qualified to vote!!")

        }
    println("This will always display")


    }
