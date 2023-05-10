package kotlinprograms

fun main(){
    //set
    var numbers = setOf<Int>(1,3,5,7,9)
    println(numbers.elementAt(0))

    var ctrl :Int = 0
    while(ctrl < numbers.size) {
        println(numbers.elementAt(ctrl))
        ctrl++
    }
    println("***************")
    var numbers2 = mutableSetOf<Int>(1,3,5,7,9)
    numbers2.add(6)
    numbers2.remove(3)

    var ctrl2 :Int = 0
    while(ctrl2 < numbers2.size) {
        println(numbers2.elementAt(ctrl2))
        ctrl2++
    }

}