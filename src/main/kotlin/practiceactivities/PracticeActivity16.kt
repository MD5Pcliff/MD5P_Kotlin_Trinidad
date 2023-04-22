fun main(){
    var n1 :Int = 0
    var n2 :Int = 0
    var n3 :Int = 0

    println("Enter Number 1:")
    n1 = readln().toInt()
    println("Enter Number 2:")
    n2 = readln().toInt()
    println("Enter Number 3:")
    n3 = readln().toInt()

    if((n1 < n2) && (n1 < n3)){
        println("The Smallest Number is $n1")
    }else if((n2 < n1) && (n2 < n3)){
        println("The Smallest Number is $n2")
    }else if((n3 < n1) && (n3 < n2)){
        println("The Smallest Number is $n3")
    }
}