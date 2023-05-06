package practiceactivities
//not finished
fun main() {
    while(true){
        try {
    println("Enter a Positive Integer")
    var n = readln().toInt()
        when(n > 0) {
            true -> {
                var count = 0
                var num = 1
                repeat(n) {
                    count++
                    num *= count
                }
                println("The factorial of $n is equal to $num")
                break
            }
        false -> {println("Error: Invalid Input enter a Positive Integer")}}
        }catch (exception:Exception){
        println("Error: Invalid Input enter a Positive Integer")
    }
}
}