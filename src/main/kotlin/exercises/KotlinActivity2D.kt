fun main() {
    while (true) {
        try {
            //variables declaration
            var values = mutableListOf<Double>()
            var num = 5

            //input
            for (i in 1..num) {
                print("Input Monetary Value #$i: ")
                values.add(readln().toDouble())
            }
            println("Divide total value by how many? ")
            var div = readln().toDouble()

            //process
            var total = values.sum()
            var quotient = total / div

            //output
            println("Monetary Total is ${String.format("%.1f",total)}")
            println("Quotient is ${String.format("%.1f",quotient)}")
            break
        } catch (e:NumberFormatException) {
            println("Error: Input can only be numerics.")
            println("Restarting Program...")
        }
    }
}