import java.lang.Math.max

fun main() {
    var integers = ArrayList<Int>()
    println("Enter Number 1:")
    integers.add(readln().toInt())
    println("Enter Number 2:")
    integers.add(readln().toInt())
    println("Enter Number 3:")
    integers.add(readln().toInt())
    println("Enter Number 4:")
    integers.add(readln().toInt())
    println("Enter Number 5:")
    integers.add(readln().toInt())
    var sorted = integers.toSortedSet()
    println(sorted)
    println("The min value is:${(sorted.elementAt(0))}")
    println("The max values is:${(sorted.elementAt(4))}")

}