fun main(){
    //Declaration of Variable
    var counter :Int = 1 //Number of Loop
    var number :Int = 1 //factors of Integer
    var n :Int = 0 //Positive Interger
    println("Please enter a positive interger:")
    n = readln().toInt()

    //Process
    do{
        number = number * counter
        counter++
        //>>body

    }while(counter<=n)//Condition
    //Output
    println("The factorial of $n is equal to $number")
}