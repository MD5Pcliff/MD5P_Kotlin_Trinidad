fun main() {
    print("Please Enter Desired Number of Row:")
    var row = readln().toInt()
    print("Please Enter Desired Number of Column:")
    var column = readln().toInt()
    var count = 0
    var matrix = mutableListOf<MutableList<Int>>()

        repeat(row) {
            matrix.add(mutableListOf())
        }

        for (i in count..row - 1) {
            var col = 0
            var colList = mutableListOf<Int>()
            for (j in col..column - 1) {
                println("Please Enter Number:")
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




}


