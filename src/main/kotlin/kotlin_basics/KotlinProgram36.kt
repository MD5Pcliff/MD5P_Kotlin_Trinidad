package kotlin_basics

fun main(){
    //Multiple Catch
    var number1 :Int = 0
    var number2 :Int = 0
    //Exception handling - try and catch block
    try{
        println("**********************")
        println("Simple Calculator")
        println("**********************")
        println("Enter Number 1:")
        number1 = readln().toInt()
        println("Enter Number 2:")
        number2 = readln().toInt()
        println("The qoutient is ${number1/number2}")
    }catch(exception:NumberFormatException){
        println("For Number Format Exception")
        println("Wrong Input! Integer Inputs Only")
    }catch(exception:ArithmeticException){
        println("For Arithmetic Exception")
        println("Wrong Input! Integer Inputs Only")
    }catch(exception:Exception){ //all kinds of exceptions
        println("Wrong Input! Integer Inputs Only")
    }
    println("This is a test")
}