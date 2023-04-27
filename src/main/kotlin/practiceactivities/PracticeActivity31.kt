package practiceactivities

fun main(){
    //Input of Data
    var setA = mutableSetOf<Int>()
    var setB = mutableSetOf<Int>()
    println("Values for Set A:")
    println("Please Enter Number 1:")
    setA.add(readln().toInt())
    println("Please Enter Number 2:")
    setA.add(readln().toInt())
    println("Please Enter Number 3:")
    setA.add(readln().toInt())
    println("Please Enter Number 4:")
    setA.add(readln().toInt())
    println("Please Enter Number 5:")
    setA.add(readln().toInt())
    println("Values for Set B:")
    println("Please Enter Number 1:")
    setB.add(readln().toInt())
    println("Please Enter Number 2:")
    setB.add(readln().toInt())
    println("Please Enter Number 3:")
    setB.add(readln().toInt())
    println("Please Enter Number 4:")
    setB.add(readln().toInt())
    println("Please Enter Number 5:")
    setB.add(readln().toInt())
    //process
    var interSet = setA.intersect(setB)
    //output
    println("Intersection of the Sets: $interSet")
}