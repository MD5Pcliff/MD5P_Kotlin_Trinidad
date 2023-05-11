fun main() {
    print("Enter Book Title: ")
    var bookName = readln()
    print("Enter Borrower's Name: ")
    var borrower = readln()
    print("Enter Return Deadline: ")
    var numOfDay = readln()
    var bookCheck = mutableListOf<String>()
    var storeBorrowInfo = { bookName: String, borrower: String, numOfDay: String ->
        bookCheck.add(bookName)
        bookCheck.add(borrower)
        bookCheck.add(numOfDay)
    }
    storeBorrowInfo(bookName,borrower,numOfDay)
    println(bookCheck)
}