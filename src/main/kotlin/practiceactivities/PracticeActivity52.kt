fun main() {
    var list = mutableListOf<Int>()
    print("Enter of list:")
    var n = readln().toInt()

    repeat(n) {
        println("Enter number:")
        list.add(readln().toInt())
    }
    var average = {n:Int ->
        var num = 0

        repeat(n){
            num += list[it]
        }
        var ave = num/n
        ave
    }
    println("The average is ${average(n)}")
}
//Not Finished