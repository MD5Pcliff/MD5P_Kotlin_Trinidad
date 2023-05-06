fun main(){
    val displayNumber = {n:Int -> "Number: $n"}
    val result =displayNumber(41)
    println(result)

   val numList = listOf(1, 2, 3, 4, 5)

    println(higherOrderFunction3(numList, displayNumber))
}
fun higherOrderFunction3(numList:List<Int>, transformFunction:(Int) -> String): List<String>{
    val list = mutableListOf<String>()
    repeat(5) {
       list.add(transformFunction(numList[it]))
    }
   return list
}