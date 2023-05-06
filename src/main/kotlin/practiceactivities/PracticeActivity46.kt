package practiceactivities

fun main() {
    var list = mutableListOf<Double>()
    print("Enter of list:")
    var n = readln().toInt()

    repeat (n){
        println("Enter number:")
        list.add(readln().toDouble())

    }
    println(average(list))
}
fun average(list:List<Double>):Double{
    var num = 0.0
    var count = 0
    do {
        num += list[count]
        count++
    }while ( count < list.size)
    var average = "${String.format("%.2f",num/list.size)}"
    var ave = average.toDouble()

    return ave


    }


