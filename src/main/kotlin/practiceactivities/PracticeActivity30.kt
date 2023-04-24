fun main(){
    var data = mapOf("Alice" to "555-1234" , "Bob" to "555-5678" , "Charlie" to "555-9101")
    println("What is the Name:")
    var name = readln()
    println("$name's telephone number is ${data[name]}")

}

