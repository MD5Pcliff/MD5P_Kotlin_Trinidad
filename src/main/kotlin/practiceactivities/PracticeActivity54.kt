package practiceactivities
//not finished
fun main(){

    println(calculateAverage(2,3,5,7))
}
fun calculateAverage(vararg n:Int):Int{
    var total = 0
    var ave = 0
    var count = 0
    for (num in n){
        total += num
        count++
    }
    ave = total/count
    return ave
}