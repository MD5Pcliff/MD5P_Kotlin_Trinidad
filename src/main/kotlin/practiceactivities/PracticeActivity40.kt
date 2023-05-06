package practiceactivities

fun main(){
    print("Enter a text:")
    var text = readln()
    println(removeDuplicate(text))

}
fun removeDuplicate(text:String):String{
    var word = " "
    var set = mutableSetOf<Char>()
    for (char in text) {
        if (set.add(char)){
            word += char
        }
        word = word
    }
    return word
}