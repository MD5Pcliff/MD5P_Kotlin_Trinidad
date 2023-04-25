package practiceactivities

fun main(){
    var temp :Double = 0.0
    print("Main Menu")
    println("a. Celsius to Fahrenheit")
    println("b. Fahrenheit to Celsius")
    println("c. Exit Program")
    println("Choose Option ['a' , 'b' or 'c']")
    var n = readln()
    when(n){
        "a" -> {
            println("Celsius to Fahrenheit")
            println("Enter Celsius:")
            temp = readln().toDouble()
            temp = ((9.0/5.0)*temp+32)
            println("Fahrenheit is equal to ${String.format("%.2f",temp)}")
        }
        "b" -> {
            println("Fahrenheit to Celsius")
            println("Enter Fahrenheit:")
            temp = readln().toDouble()
            temp = ((temp-32)*5.0/9.0)
            println("Celsius is equal to ${String.format("%.2f",temp)}")
        }
        "c" -> {
            println("End of Program. Good bye!")
        }

    }
}