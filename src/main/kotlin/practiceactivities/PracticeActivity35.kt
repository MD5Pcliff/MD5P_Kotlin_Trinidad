package practiceactivities

fun main(){
    println("Please Enter Desired Number of Row:")
    var row = readln().toInt()
    println("Please Enter Desired Number of Row:")
    var column = readln().toInt()
    var matrix = Array(row, {IntArray(column)})
    for (i in 0 .. matrix.size-1){
        var colArray = IntArray(column)
        for (j in 0..colArray.size-1){
            println("Please Enter Number")
            colArray[j] = readln().toInt()

        }
        matrix[i] = colArray
    }
    for (col in matrix){
        for (j in col){
            print(j)
            print(" ")
        }
        println(" ")
    }





}