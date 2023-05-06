package practiceactivities

fun main(){
    print("Enter number of Eggs:")
    var num = readln().toInt()
    println(dozen(num))
    println(showLessDozen(num))
}
fun dozen(num:Int):String{
    var dozen = num/12
    return "Number of Dozen is $dozen"

}
fun showLessDozen(num:Int):String{
    var lessDozen = num%12
    return "Eggs less than a dozen: $lessDozen"
}