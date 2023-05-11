fun main(){
    //ArrayList of grocery products with 20 entries
    var grocery = ArrayList<String>()
    grocery.add(0,"coke")
    grocery.add(1,"sprite")
    grocery.add(2,"royal")
    grocery.add(3,"tasty")
    grocery.add(4,"cereal")
    grocery.add(5,"nido")
    grocery.add(6,"salt")
    grocery.add(7,"sugar")
    grocery.add(8,"soy sauce")
    grocery.add(9,"vinegar")
    grocery.add(10,"fish sauce")
    grocery.add(11,"rice")
    grocery.add(12,"seasoning")
    grocery.add(13,"apple")
    grocery.add(14,"banana")
    grocery.add(15,"orange")
    grocery.add(16,"coffee")
    grocery.add(17,"juice")
    grocery.add(18,"water")
    grocery.add(19,"wine")
    grocery.add(20,"oil")

    //HashMap
    var cart = HashMap<String , Int>()
    //Process
    var selection = " "
    try{
        do{
            println("What would you like to do?")
            println("a. Add to Cart")
            println("b. Checkout")
            println("c. Remove to Cart")
            println("d. Exit Program")
            println("Enter your selection:")
            selection = readln().lowercase()
        when(selection) {

            "a" -> {
                addToCart(cart)
            }

            "b" -> {
                checkOut(cart)
            }

            "c" -> {
                println("What item you wish to remove")
                var item = readln()
                removeFromCart(item, cart)
            }

            "d" -> {
                println("Exiting Program. Bye!")
            }
        }

    }while (selection != "d")

    }catch (exception:Exception){
        println("Wrong Value")
    }
}
fun addToCart(cart:HashMap<String, Int>){ //-> function to add items on cart

    print("Enter product: ")
    var product = readln()
    print("Quantity: ")
    var qty = readln().toInt()
    cart.put(product,qty)

}
fun checkOut(cart:HashMap<String, Int>){ //-> function to checkout items on cart
    var total = 0
    println("List of items on Cart")
    for((key, value) in cart){
        total += value
    }

    println("Total items: $total")
}

fun removeFromCart(item:String ,cart:HashMap<String, Int>){ // -> function to remove items on cart
    cart.remove(item)
}