fun main(){
    println("Please Enter Name of Product:")
    var name = readln()
    println("Please Enter Items Price:")
    var price = readln().toDouble()
    if(price > 100000){
        println("Price of $name is $price")
        println("Discount is ${(price*.20)}")
        println("Net Price is ${String.format("%.2f",(price-(price*.2)))}")
    }else if(price > 50000) {
        println("Price of $name is $price")
        println("Discount is ${(price * .15)}")
        println("Net Price is ${String.format("%.2f", (price - (price * .15)))}")
    }else if(price > 20000) {
            println("Price of $name is $price")
            println("Discount is ${(price * .10)}")
            println("Net Price is ${String.format("%.2f", (price - (price * .1)))}")
    }else if(price > 10000) {
        println("Price of $name is $price")
        println("Discount is ${(price * .5)}")
        println("Net Price is ${String.format("%.2f", (price - (price * .5)))}")
    }else if(price > 0) {
        println("Price of $name is $price")
        println("No Discount")
        println("Net Price is ${String.format("%.2f",price)}")
    }else{
        println("Invalid Input")
    }
}