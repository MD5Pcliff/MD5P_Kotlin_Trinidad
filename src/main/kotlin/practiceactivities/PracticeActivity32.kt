package practiceactivities

fun main(){

    var setA = mutableMapOf<String , Double>()
    println("Enter Athlete's Name:")
    var a = readln()
    println("Enter Athlete's Sales:")
    setA[a] = readln().toDouble()
    println("Enter Athlete's Name:")
    var b = readln()
    println("Enter Athlete's Sales:")
    setA[b] = readln().toDouble()
    println("Enter Athlete's Name:")
    var c = readln()
    println("Enter Athlete's Sales:")
    setA[c] = readln().toDouble()
    println("Enter Athlete's Name:")
    var d = readln()
    println("Enter Athlete's Sales:")
    setA[d] = readln().toDouble()
    println("Enter Athlete's Name:")
    var e = readln()
    println("Enter Athlete's Sales:")
    setA[e] = readln().toDouble()


    print("Names")
    println(" Sales")
    var total = 0.0




    for ((id, element) in setA) {
        println("$id     ${element.toDouble()}")
        total = total+element

    }

    println("_____________")
    println("Total   $total")





}