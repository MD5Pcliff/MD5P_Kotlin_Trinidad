package practiceactivities

fun main(){
    println("Enter a String:")
    var word = readln()
    println("The Number of words in the sentence is ${countWords(word)}")
}
fun countWords(word:String):Int{
    var count = 0
    var strArray = word.split(" ".toRegex())


    for (a in strArray){
        if (a!=" "){
            count++
        }
    }
    return count
}