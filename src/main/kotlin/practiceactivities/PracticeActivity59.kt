fun main(){
    while (true)
    try {
        println("Enter a decimal number:")
        var n = readln().toDouble()
        var x = n.toInt()
        println(x)
        break
    }catch(exception:Exception){
        println("Error: Invalid Input. Please Enter a valid decimal number")
    }
}