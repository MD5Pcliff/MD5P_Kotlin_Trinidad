fun main(){
    //Declaration of Variables
    println("Enter Base size of Dollar Triangle:")
    var n = readln().toInt()
    var number = 25
    var ctrl = 0

    //Process
    while (ctrl < n) {
        var ctrl2 = 0
        while(ctrl2 < n){
            if(ctrl2 < (n - (ctrl + 1))) {
                var number1 = 0
                number1 = number-(ctrl2*5)
                print(number1)
                ctrl2++
            }
            number-ctrl
            println()
            ctrl++

        }

    }



}
