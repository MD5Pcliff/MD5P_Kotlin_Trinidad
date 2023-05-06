package practiceactivities

fun main(){
    //Declaration of Variables
    var num = 25
    var num2 = 0
    var num3 = 5

    for (counter in 1..num3){
        num2 = num
        for (colCount in 1..num3){
            print(num2)
            print(" ")
            num2 -= num3
        }
        println()
        num--
    }


}