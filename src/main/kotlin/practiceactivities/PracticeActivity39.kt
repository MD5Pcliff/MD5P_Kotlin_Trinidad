package practiceactivities

fun main(){
    print("Enter a string:")
    var string = readln()
    println(reverse(string))
}
fun reverse(word:String):String{
    var reverse = word.reversed()
    return reverse
}