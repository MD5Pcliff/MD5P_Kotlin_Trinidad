fun main() {
    var name = mutableListOf<String>("CATEGORY","LANGUAGE","LAST BORROWED", "COPIES AVAILABLE")
    var book1 = mutableListOf("PROGRAMMING","English","01-02-23",4)
    var book2 = mutableListOf("TRIGONOMETRY","English","03-02-23",2)
    var book3 = mutableListOf("ALGEBRA","English","04-07-23",5)
    var book4 = mutableListOf("PHYSICS","Hindi","01-12-23",1)

    //input
    print("Enter Book Title to check: ")
    var bookTitle = readln().uppercase()

    //process + output
    var checkBook = { checkBook: String ->
        println(name)
        if (checkBook == "PROGRAMMING") {
            println(book1)
        } else if (checkBook == "TRIGONOMETRY") {
            println(book2)
        } else if (checkBook == "ALGEBRA") {
            println(book3)
        } else if (checkBook == "PHYSICS") {
            println(book4)
        } else {
            println("Book does not exist in system")
        }
    }

    checkBook(bookTitle)

}