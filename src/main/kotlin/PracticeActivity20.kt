fun main(){
    var n = 0
    println("Enter a Positive Number:")
    n = readln().toInt()
    var multiplier = 0
    while(multiplier <=10){
        println("$n * $multiplier = ${n*multiplier}")
        multiplier++

    }
}