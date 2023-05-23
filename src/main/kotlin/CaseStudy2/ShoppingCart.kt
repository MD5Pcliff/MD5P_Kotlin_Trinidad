package CaseStudy2

class ShoppingCart() {
    var shoppingCart = mutableListOf<Book>()
    fun addToCart(book:Book){
        println("Book added to Cart ${book.getTitle()}")
        shoppingCart.add(book)
    }
    fun removeFromCart(book:Book){
        println("Book removed from Cart ${book.getTitle()}")
        shoppingCart.remove(book)
    }
    fun displayCart(){
        for (book in shoppingCart){
            book.displayInfo()
        }
    }
}