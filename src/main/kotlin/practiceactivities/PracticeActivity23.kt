package practiceactivities

fun main() {
    var num = ArrayList<Int>()
    println("Enter Number 1")
    num.add(readln().toInt())
    println("Enter Number 2")
    num.add(readln().toInt())
    println("Enter Number 3")
    num.add(readln().toInt())
    println("Enter Number 4")
    num.add(readln().toInt())
    println("Enter Number 5")
    num.add(readln().toInt())

    var ctrl: Int = 0
    var count: Int = 0
    while (ctrl < num.size) {
        if(num[ctrl]%2 == 0){
            count++
            ctrl++
        }else{
            ctrl++
        }
    }
    println("The number of even is $count")

}

