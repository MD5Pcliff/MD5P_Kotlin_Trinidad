fun main() {
    //arraylist declaration
    var bookName = arrayListOf<String>(
        "CLIFF", "GOKU", "VEGETA", "GOHAN", "PICCOLO",
        "KLIRIN", "TRUNKS", "BROLY", "BUU", "FRIEZA",
        "CELL", "SHENRON", "YAMCHA", "TIEN", "NARUTO",
        "SASUKE", "SAKURA", "HINATA", "NEJI", "TRUNKS"
    )
    //menu
    println("Select Task to be Performed:")
    println("[1] Check if Book is in Record")
    println("[2] Add Book in Record")
    println("[3] Remove Book in Record")
    println("[4] Count Book in Record")
    println("[5] Wild Search for Book in Record")
    println("[6] Search for Book in Record")
    println("[7] Wild Search/Search for Book in Record")
    println("[8] Show Books in Record")
    println("[9] Exit")

    //menu selection input
    print("Selection: ")
    var selection = readln().toInt()

    //process
    var input: String = ""
    while(true){
        when (selection) {
            1 -> {
                print("Enter Name of Student: ")
                input = readln().uppercase()
                isBookInRecord(input, bookName)
                break
            }

            2 -> {
                print("Enter Name of Student: ")
                input = readln().uppercase()
                addBook(input, bookName)
                println(bookName)
                break
            }

            3 -> {
                print("Enter Name of Student: ")
                input = readln().uppercase()
                removeBook(input, bookName)
                println(bookName)
                break
            }

            4 -> {
                print("The number of Student is ")
                countBooks(input, bookName)
                println(bookName)
                break
            }

            5 -> {
                print("Enter Name of String: ")
                input = readln().uppercase()
                println(searchBookWildSearch(input, bookName))

            }

            6 -> {
                print("Enter Name of String: ")
                input = readln().uppercase()
                println(searchBookName(input, bookName))
                break
            }

            7 -> {
                print("Enter Name of String: ")
                input = readln().uppercase()
                println(searchBook(input, bookName))
                break
            }

            8 -> {
                println(showStudents(bookName))
                break
            }

            9 -> {
                println("Exiting Program")
                break
            }
        }
    }
}

fun isBookInRecord (input: String, studentTable: ArrayList<String>) {
    println(studentTable.contains(input))
}

fun addBook(input:String , studentTable: ArrayList<String>){
    studentTable.add(input)
}
fun removeBook(input:String , studentTable: ArrayList<String>){
    studentTable.remove(input)
}
fun countBooks(input:String , studentTable: ArrayList<String>){
    println(studentTable.size)
}
fun searchBookWildSearch(input:String , studentTable: ArrayList<String>){
    var count = 0
    repeat(studentTable.size) {
        if (studentTable.elementAt(count).contains(input))
            println(studentTable.elementAt(count))
        count++
    }
}
fun searchBookName (input: String, studentTable: ArrayList<String>) {
    if (studentTable.contains(input)) {
        var x =(studentTable.indexOf(input))
        println(studentTable.elementAt(x))
    }
}
fun searchBook(input: String, studentTable: ArrayList<String>) {
    if (input.length <= 3) {
        var count = 0
        repeat(studentTable.size) {
            if (studentTable.elementAt(count).contains(input))
                println(studentTable.elementAt(count))
            count++
        }
    }; else {
        if (studentTable.contains(input)) {
            var x = (studentTable.indexOf(input))
            println(studentTable.elementAt(x))
        }
    }
}
fun showBooks(studentTable:ArrayList<String>){
    println(studentTable)
}