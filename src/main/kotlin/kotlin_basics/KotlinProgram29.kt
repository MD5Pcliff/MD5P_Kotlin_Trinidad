package kotlin_basics

fun main(){
    var matrix = listOf(
        //      0    1    2
        listOf('a', 'b', 'c'), //0
        listOf('d', 'e', 'f'), //1
        listOf('g', 'h', 'i'), //2
        listOf('j', 'k', 'l')
    )
    println(matrix.size) //gets the number of row
    //- is the number of list inside the list
    var row = 0
    while(row < matrix.size){
        var column = 0
        while (column < matrix[row].size){
            print("${matrix[row][column]} \t")

            column++
        }

        row++
        println()
    }
}