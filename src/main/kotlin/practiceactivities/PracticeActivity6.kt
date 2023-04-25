package practiceactivities

fun main(){
    var n :Int = 0
    println("Please Enter a Number:")
    n = readln().toInt()
    if(n > 0){
        println("The number is Positive!")
    }else if(n < 0){
        println("The number is Negative!")
    }else if(n == 0){
        println("The number is Zero")
    }
}