fun main() {
    print("Please Enter Desired Number of Row:")
    val row = readln().toInt()
    print("Please Enter Desired Number of Column:")
    val column = readln().toInt()
    var count = 0
    val matrix = mutableListOf<MutableList<Int>>()

    repeat(row) {
        matrix.add(mutableListOf())
    }

    for (i in count..row - 1) {
        var col = 0
        val colList = mutableListOf<Int>()
        for (j in col..column - 1) {
            print("Please Enter Number:")
            colList.add(readln().toInt())
            col++

        }
        matrix[count] = colList
        count++


    }
    for (colList in matrix) {
        for (j in colList)
            print("$j\t")
        print("\n")


    }
    for (index in matrix) {
        val i1 = matrix[0][0] + matrix[0][1] + matrix[0][2]
        val i2 = matrix[1][0] + matrix[1][1] + matrix[1][2]
        val i3 = matrix[2][0] + matrix[2][1] + matrix[2][2]
        val j1 = matrix[0][0] + matrix[1][0] + matrix[2][0]
        val j2 = matrix[0][1] + matrix[1][1] + matrix[2][1]
        val j3 = matrix[0][2] + matrix[1][2] + matrix[2][2]
        val d1 = matrix[0][0] + matrix[1][1] + matrix[2][2]
        val d2 = matrix[2][0] + matrix[1][1] + matrix[0][2]
        println("$i1   $i2     $i3")
        println("$j1   $j2     $j3")
        println("$d1   $d2     ")
        if (i1 == 15 && i2 == 15 && i3 == 15 && j1 == 15 && j2 == 15 && j3 == 15 && d1 == 15 && d2 == 15) {
            println("The Matrix is a Magic Square")
        } else {
            println("The Matrix is not a Magic Square")
        }
    }
}


