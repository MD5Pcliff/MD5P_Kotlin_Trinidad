fun main(){
    println("Enter number 1:")
    var n1 = readln().toInt()
    println("Enter number 2:")
    var n2 = readln().toInt()
    try{
        var sum = n1+n2
        println("The sum of $n1 and $n2 is $sum")
        var difference = n1-n2
        println("The difference of $n1 and $n2 is $difference")
        var product = n1*n2
        println("The product of $n1 and $n2 is $product")
        var quotient = n1/n2
        println("The quotient of $n1 and $n2 is $quotient")
    }catch(exception:Exception){
        println("Error: Arithmetic Overflow. The result of the operation exceeds the maximum value of an integer")
    }
}