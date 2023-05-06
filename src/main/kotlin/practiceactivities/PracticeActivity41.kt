package practiceactivities

fun main(){
    print("Enter a text:")
    var text = readln()
    println(replaceSpaces(text))

}
fun replaceSpaces(text:String):String{
    var word = text.replace(" ","_")
    return word
}