fun main() {
    //arraylist declaration
    var studentTable = arrayListOf<String>(
        "CLIFF", "GOKU", "VEGETA", "GOHAN", "PICCOLO",
        "KLIRIN", "TRUNKS", "BROLY", "BUU", "FRIEZA",
        "CELL", "SHENRON", "YAMCHA", "TIEN", "NARUTO",
        "SASUKE", "SAKURA", "HINATA", "NEJI", "TRUNKS"
    )
    //menu
    println("Select Task to be Performed:")
    println("[1] Check if Student is in Record")
    println("[2] Add Student in Record")
    println("[3] Remove Student in Record")
    println("[4] Count Students in Record")
    println("[5] Wild Search for Student in Record")
    println("[6] Search for Student in Record")
    println("[7] Wild Search/Search for Student in Record")
    println("[8] Show Students in Record")
    println("[9] Exit")

    //menu selection input
    print("Selection: ")
    var menuSelection = readln().toInt()

    //process
    var input: String = ""
    while(true){
    when (menuSelection) {
        1 -> {
            print("Enter Name of Student: ")
            input = readln().uppercase()
            isStudentInRecord(input, studentTable)
            break
        }

        2 -> {
            print("Enter Name of Student: ")
            input = readln().uppercase()
            addStudent(input, studentTable)
            println(studentTable)
            break
        }

        3 -> {
            print("Enter Name of Student: ")
            input = readln().uppercase()
            removeStudent(input, studentTable)
            println(studentTable)
            break
        }

        4 -> {
            print("The number of Student is ")
            countStudent(input, studentTable)
            println(studentTable)
            break
        }

        5 -> {
            print("Enter Name of String: ")
            input = readln().uppercase()
            println(searchStudentWildSearch(input, studentTable))

        }

        6 -> {
            print("Enter Name of String: ")
            input = readln().uppercase()
            println(searchStudentName(input, studentTable))
            break
        }

        7 -> {
            print("Enter Name of String: ")
            input = readln().uppercase()
            println(searchStudent(input, studentTable))
            break
        }

        8 -> {
            println(showStudents(studentTable))
            break
        }

        9 -> {
            println("Exiting Program")
            break
        }
    }
    }
}

fun isStudentInRecord (input: String, studentTable: ArrayList<String>) {
    println(studentTable.contains(input))
}

fun addStudent(input:String , studentTable: ArrayList<String>){
    studentTable.add(input)
}
fun removeStudent(input:String , studentTable: ArrayList<String>){
    studentTable.remove(input)
}
fun countStudent(input:String , studentTable: ArrayList<String>){
    println(studentTable.size)
}
fun searchStudentWildSearch(input:String , studentTable: ArrayList<String>){
    var count = 0
    repeat(studentTable.size) {
        if (studentTable.elementAt(count).contains(input))
            println(studentTable.elementAt(count))
            count++
    }
}
fun searchStudentName (input: String, studentTable: ArrayList<String>) {
    if (studentTable.contains(input)) {
        var x =(studentTable.indexOf(input))
        println(studentTable.elementAt(x))
    }
}
fun searchStudent(input: String, studentTable: ArrayList<String>) {
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
fun showStudents(studentTable:ArrayList<String>){
    println(studentTable)
}