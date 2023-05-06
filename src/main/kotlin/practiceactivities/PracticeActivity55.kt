package practiceactivities

fun main() {
    var num1 = 0
    var num2 = 0
    var quotient = 0
    while (true) {
        try {
            println("Enter Number 1:")
            num1 = readln().toInt()
            println("Enter Number 2:")
            num2 = readln().toInt()

            println("The quotient of $num1 and $num2 is equal to ${num1/num2}")
        } catch (exception: Exception) {
            println("Error: Division Error")
        }
    }
}