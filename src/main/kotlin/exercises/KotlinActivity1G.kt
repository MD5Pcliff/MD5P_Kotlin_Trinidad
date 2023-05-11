package exercises
fun main(){
    println("Enter a String:")
    val word = readln()
    if(word == word.reversed()){
           println("Palindrome")

        }else {
            println("Not Palindrome")

    }
}