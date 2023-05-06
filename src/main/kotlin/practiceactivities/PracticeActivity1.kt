package practiceactivities

fun main(){
    print("Enter a text:")
    var text = readln()
    print("Enter a text:")
    var ch = readln()
//    var string:String = "Hello World"
//    println(string[2])
    var ctr = 0
    var occurence = 0
    while (ctr < text.length){
        if(text[ctr].lowercase() == ch.lowercase()) {
        //    println(text[ctr])
            occurence++
        }
        ctr++
    }
    println("The letter $ch occurred $occurence times in the word $text")
//    var base :Int = 0
//    var height :Int = 0
//
//    println("Enter value of base:")
//    base = readln().toInt()
//    println("Enter value of height:")
//    height = readln().toInt()
//    println("Area of Triangle is ${base*height/2}")
//
//    var a :Int = 0
//    var b :Int = 0
//
//    println("Enter value of a:")
//    a = readln().toInt()
//    println("Enter value of b:")
//    b = readln().toInt()
//
//    println("c = ${(2*a+2*(a*b)-4*(a+b))/2}")
}


