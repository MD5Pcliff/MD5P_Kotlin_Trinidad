package kotlin_basics

fun main(){
    //when statement -> java , c , c# , c++ -> switch statement
    //digits to word
    var num :Int = 0
    println("Enter a Number")
    num = readln().toInt()

    //when statement does not use conditional operators
    when(num){
        1 -> {
            println("One")
        }
        2 -> {
            println("Two")
        }
        3 -> {
            println("Three")
        }
        else -> {
            println("Invalid Number")
        }
    }
}