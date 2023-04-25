package kotlinprograms

fun main(){
    //list
    var beatles = listOf<String>("Paul" , "John" , "Ringo" , "George")
    println("list size is ${beatles.size}")//showing size of list
    var ctrl :Int = 0
    while(ctrl < beatles.size) {
        println(beatles[ctrl])
        ctrl++
    }
    println("*************************")
    //list -mutable - can be changed
    var rivermaya = mutableListOf<String>("Bamboo" , "Rico" , "Perf" , "Juan")
    rivermaya.removeAt(0)//remove index
    rivermaya.remove("Rico")//remove element
    rivermaya.add("John")//add in last index
    rivermaya.add(2 ,"Peter") //add in specific index
    rivermaya[0] = "Ely" //changed element
    var ctrl2 = 0
    while(ctrl2 < rivermaya.size) {
        println(rivermaya[ctrl2])
        ctrl2++
    }
}