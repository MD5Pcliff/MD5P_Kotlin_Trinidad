fun main() {
    //Challenge1.kt
    //Single Catch
    var number1: Int = 0
    var number2: Int = 0
    var isIncorrect: Boolean = true
    //Exception handling - try and catch block
    do{
        try {
            println("**********************")
            println("Simple Calculator")
            println("**********************")
            println("Enter Number 1:")
            number1 = readln().toInt()
            println("Enter Number 2:")
            number2 = readln().toInt()
            println("The qoutient is ${number1 / number2}")
            isIncorrect = false
        } catch (exception: Exception) { //all kinds of exceptions
            println("Wrong Input! Integer Inputs Only")
        }

    }while (isIncorrect);

    println("This is a test")
}
