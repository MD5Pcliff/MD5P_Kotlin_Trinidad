package CaseStudy2

class Book(private var title:String , private var author:String , private var price:Double , private var quantityInStock:Int) {
    fun setTitle(title:String){
        this.title = title
    }
    fun getTitle():String{
        return title
    }
    fun setAuthor(author:String){
        this.author = author
    }
    fun getAuthor():String{
        return author
    }
    fun setPrice(price:Double){
        this.price = price
    }
    fun getPrice():Double{
        return price
    }
    fun setQty(quantityInStock: Int){
        this.quantityInStock = quantityInStock
    }
    fun getQty():Int{
        return quantityInStock
    }
    fun displayInfo(){
        println("The Title of the book is $title")
        println("The book author is $author")
        println("The book price is $price")
        println("Number of Stocks: $quantityInStock")

    }
}