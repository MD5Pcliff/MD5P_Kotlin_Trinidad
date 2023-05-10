package kotlin_basics

fun main(){
    //logical operators
    var andOperator = (6 > 1) && (5 > 1) // will only be true if both statement is true
    var orOperator = (1 > 5) || (6 > 3) //will only be false if both statemenet is false
    var notOperator = !(5 == 5) //inverts the result

    println(andOperator)
    println(orOperator)
    println(notOperator)
}