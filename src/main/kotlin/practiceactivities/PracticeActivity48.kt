import practiceactivities.countOccurrence

fun main(){

    print("Enter a text:")
    var text = readln()
    print("Enter a text:")
    var ch = readln()
    var n = (text occur ch)
    println("The letter $ch occurred $n times in the word $text")
}
infix fun String.occur(ch:String):Int{
    var ctr = 0
    var occurence = 0
    while (ctr < this.length){
        if(this[ctr].lowercase() == ch.lowercase()) {
            occurence++
        }
        ctr++

    }
    return occurence
}