package kotlin_basics

fun main(){
    //length
    val mytext = "Hello World!"
    val stringlength = mytext.length
    println(stringlength)

    //lowercase and uppercase
    val uppercase = mytext.uppercase()
    val lowercase = mytext.lowercase()
    println(uppercase)
    println(lowercase)

    //contains
    val searchtext = "hello"
    val result = mytext.uppercase().contains(searchtext.uppercase())
    println(result)

    //replace
    val replacedtext = mytext.replace("World", "Kotlin")
    println(replacedtext)

    //accessing index
    println("${mytext[0]} ${mytext[11]}")
}