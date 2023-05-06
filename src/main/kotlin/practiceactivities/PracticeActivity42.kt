package practiceactivities
fun main(){

    print("Enter a text:")
    var text = readln()
    print("Enter a text:")
    var ch = readln()
    var n = countOccurrence(text,ch)
    println("The letter $ch occurred $n times in the word $text")
}
fun countOccurrence(text:String, ch:String):Int {
    var count = 0

    var word = " "
    var ctr = 0
    var occurence = 0
    while (ctr < text.length){
        if(text[ctr].lowercase() == ch.lowercase()) {
            occurence++
        }
        ctr++

     }
    return occurence
}

