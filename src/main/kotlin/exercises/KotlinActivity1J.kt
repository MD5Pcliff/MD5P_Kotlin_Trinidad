fun main() {

    var price = hashMapOf<String, Double>()
    price.put("SOAP", 7.5)
    price.put("BREAD", 40.0)
    price.put("OATS", 50.55)
    price.put("WATER", 9.95)

    var cart = hashMapOf<String, Int>()


    var inputMore = 'y'
    var totalPrice:Double = 0.0
    while ((inputMore == 'y') || (inputMore == 'Y'))  {
        println("Enter Item Name: ")
        var item = readln().uppercase()
        println("Enter Amount of Item: ")
        var itemAmount = readln().toInt()

        cart.put(item,itemAmount)

        totalPrice += (price.get(item)!!) * itemAmount

        println("Input more items? ")
        inputMore = readln().first()
    }


    println(cart.entries)

    println("Total Price: ${String.format("%.2f", totalPrice)}")
}