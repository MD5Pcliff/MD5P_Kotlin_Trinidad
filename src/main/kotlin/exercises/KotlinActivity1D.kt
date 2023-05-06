package exercises

fun main() {
    var num = 0.0
    var total = 0.0
    var n = 0.0
    var ave = 0.0
    while(true) {
        try {
            println("Enter Five Amounts:")
            repeat(5) {
                println("Enter Amount ${it + 1}")
                num = readln().toDouble()
                total += num
            }
            println("The total of the entered amount is $total")
            println("Divide the value by how many?")
            n = readln().toDouble()

            ave = total / n
            println("The quotient is ${String.format("%.2f",ave)}")
            break

        } catch (exception: Exception) {
            println("Note: Error checking must be done")
        }

    }
}