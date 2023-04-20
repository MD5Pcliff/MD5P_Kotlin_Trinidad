fun main(){
    var average :Double = 0.0
    var number2 :Double = 0.0
    var number :Double = 0.0
    while((number<6)){
        println("Enter a Number")
        number = readln().toDouble()

        number2 = number2 + number
        number++



    }
    average = number2/5
    println("Average is: ${String.format("%.2f",average)}")


}