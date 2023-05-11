fun main() {
    var items = mutableListOf<String>("CATEGORY","BRAND","EXPIRATION DATE", "STOCK AVAILABLE")
    var snack = mutableListOf("MY Sans","Tommy","01-02-23",40)
    var water = mutableListOf("Purified","SM Bonus","03-02-23",24)
    var coffee = mutableListOf("Nescafe","Original","04-07-23",53)
    var hygiene = mutableListOf("Soap","Safeguard","01-12-23",12)



    print("Enter Item to check: ")
    var itemName = readln().lowercase()

    queryItem(items, itemName, snack, water, coffee, hygiene,)
}

fun queryItem(
    items: MutableList<String>,
    itemName: String,
    snack: Any,
    water: Any,
    coffee: Any,
    hygiene: Any,

) {
    println(items)
    if (itemName == "snack") {
        println(snack)
    } else if (itemName == "water") {
        println(water)
    } else if (itemName == "coffee") {
        println(coffee)
    } else if (itemName == "hygiene") {
        println(hygiene)
    } else {
        println("Item does not exist in system")
    }
}