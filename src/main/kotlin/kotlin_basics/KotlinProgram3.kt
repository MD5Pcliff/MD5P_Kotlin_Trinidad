package kotlin_basics

fun main(){
    //Input - Process - Output
    //for String only
    println("Enter your name:")
    var name :String = readln()
    println("Hello $name!!")

    //for Integer only
    println("Enter a Number:")
    var number :Int = readln().toInt()
    println("You have Entered a Number $number!")
}