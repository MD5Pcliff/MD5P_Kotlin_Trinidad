fun main(){
    var n :Int = 0

    println("Please Enter a Number from 1-7:")
    n = readln().toInt()

    when(n){
        1 -> {
            println("The Corresponding Day of the week is Monday")
        }
        2 -> {
            println("The Corresponding Day of the week is Tuesday")
        }
        3 -> {
            println("The Corresponding Day of the week is Wednesday")
        }
        4 -> {
            println("The Corresponding Day of the week is Thursday")
        }
        5 -> {
            println("The Corresponding Day of the week is Friday")
        }
        6 -> {
            println("The Corresponding Day of the week is Saturday")
        }
        7 -> {
            println("The Corresponding Day of the week is Sunday")
        }
        else -> {
            println("Invalid Number!! Please Enter a Number from 1 to 7")
        }
    }
}