fun main(){
    //declare all variables
    var number1 :Int = 0
    var number2 :Int = 0
    var sum :Int = 0
    var difference :Int = 0
    var product :Int = 0
    var quotient :Int = 0
    var modulo :Int = 0

    //Input
    println("Enter 1st Number:")
    number1 = readln().toInt()
    println("Enter 2nd Number:")
    number2 = readln().toInt()

    //Process
    sum = number1 + number2
    difference = number1 - number2
    product = number1 * number2
    quotient = number1 / number2
    modulo = number1 % number2

    //Output
    println("The sum is $sum")
    println("The difference is $difference")
    println("The product is $product")
    println("The quotient is $quotient")
    println("The modulo is $modulo")

    var base :Int = 0
    var height :Int = 0

    println("Enter value of base:")
    println("Enter value of height:")

    println("Area of Triangle is ${base*height/2}")


}