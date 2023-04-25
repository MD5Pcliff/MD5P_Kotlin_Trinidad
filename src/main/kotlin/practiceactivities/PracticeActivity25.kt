package practiceactivities

fun main(){
    println("Enter Base size of Dollar Triangle:")
    var n = readln().toInt()
    var dollar = " "
    var ctrl = 0

    while (ctrl < n) {
        var ctrl2 = 0
        while(ctrl2 < n){
            if(ctrl2 < (n - (ctrl + 1))) {
                dollar = " "
            }else{
                dollar = "$"
        }
            print(dollar)
            ctrl2++
        }
        println()
        ctrl++
    }



     }


