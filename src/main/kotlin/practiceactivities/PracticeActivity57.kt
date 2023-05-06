fun main(){
    var list = mutableListOf<Int>()
    repeat(5){
        println("Please enter number${it+1}")
        list.add(readln().toInt())
    }
    while (true)
    try{
        println("Please enter the index:")
        var n = readln().toInt()
        println(list[n])
        break
    }catch(exception:Exception){
        println("Error: Index out of bounds. Please enter index from 0 to 4")
    }
}