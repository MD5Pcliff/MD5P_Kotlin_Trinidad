package kotlinprograms

fun main(){
    // concatenation
    var firstname = "Juan"
    var middlename = "D."
    var lastname = "Dela Cruz"
    var fullname = firstname + " " + middlename + " " + lastname
    fullname =firstname.plus(" ").plus(middlename).plus(" ").plus(lastname)
    println(fullname)

    //interpolation
    fullname = "$firstname $middlename $lastname"
    println(fullname)

    //substring
    var myText = "Hello World!"
    var subtext = myText.substring(6,12)//var.substring(1st letter index , last letter index)
    println(subtext)

    //split
    var text = "Peter, Paul, Mary"
    var splitText = text.split(",")
    println(splitText)


    //trim
    var textToTrim = " \n Hello World!"
    var trimmedText = textToTrim.trim()
    println(trimmedText)
}