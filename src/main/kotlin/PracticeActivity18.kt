fun main(){
    //Declaration of Variable
    var n = 0 //Positive Interger
    println("Please Enter a Positive Interger:")
    n =readln().toInt()
    var x = 1 //additive for odd number
    var counter = 0 //number of loop

    //Process
    repeat(n-(n/2)){
        println("${counter+x}") //Computation and Output
        counter++
        x++



    }
}