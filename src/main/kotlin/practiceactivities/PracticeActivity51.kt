package practiceactivities
fun main(){
    print("Enter a Positive Integer:")
    var n = readln().toInt()
    var factorial = {n:Int ->
            var counter :Int = 1 //Number of Loop
            var number :Int = 1 //factors of Integer
            //Process
            do{
                number = number * counter
                counter++
           //>>body
            }while(counter<=n)//Condition}}
            number

    }
    println("The factorial of $n is equal to ${factorial(n)}")
}

//fun factorial(n:Int):String{
//    //Declaration of Variable
//    var counter :Int = 1 //Number of Loop
//    var number :Int = 1 //factors of Integer
//
//    //Process
//    do{
//        number = number * counter
//        counter++
//        //>>body
//
//    }while(counter<=n)//Condition
//    //Output
//    return "The factorial of $n is equal to $number"
//}
