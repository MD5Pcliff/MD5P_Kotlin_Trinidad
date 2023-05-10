package kotlin_basics

fun main(){
    println("Enter a Number:")
    var input = readln().toInt()
    var num = cube(input)
    println("The cube of $input is $num")
}
fun cube(number:Int):Int{ //parameters - data to accept from other function
    var result: Int = number * number * number
    return result
}