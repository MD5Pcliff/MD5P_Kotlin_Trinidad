package kotlin_basics
    fun main() {
        var number1: Int = 0
        var number2: Int = 0
        //Exception handling - try and catch block
        try {
            println("**********************")
            println("Simple Calculator")
            println("**********************")
            println("Enter Number 1:")
            number1 = readln().toInt()
            println("Enter Number 2:")
            number2 = readln().toInt()
            println("The qoutient is ${number1 / number2}")
        } catch (exception: Exception) { //all kinds of exceptions
            println("Wrong Input! Integer Inputs Only")
        } finally {
            println("This will always execute")
        }
        println("This is a test")
    }
