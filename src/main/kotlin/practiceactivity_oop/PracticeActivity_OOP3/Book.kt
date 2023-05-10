package practiceactivity_oop.PracticeActivity_OOP3

class Book(var title:String , var author:String , var year:String ) {
    fun printDetails(){
        println("The book title is  $title")
        println("The author of the book is $author")
        println("The book was publish on $year")
    }
}