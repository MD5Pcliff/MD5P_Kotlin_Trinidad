package exercises
fun main(){
    println("Enter string 1:")
    var string1 = readln()
    println("Enter string 2:")
    var string2 = readln()
    var set1 = mutableListOf<Char>()
    var set2 = mutableListOf<Char>()
    var count = 0
    var count2 = 0
    for (i in string1){
        set1.add(string1[count])
        count++
        }
    for (i in string2){
        set2.add(string2[count2])
        count2++

        }


}
