package practiceactivities

fun main(){
    print("Enter Length:")
    var l = readln().toDouble()
    print("Enter Width:")
    var w = readln().toDouble()
    println(calculatePerimeter(l,w))
    println(calculateArea(l,w))

}
fun calculatePerimeter(l:Double , w:Double):String{
    var perimeter = l+l+w+w
    return "The perimeter is ${String.format("%.2f",perimeter)}"
}
fun calculateArea(l:Double , w:Double):String {
    var area = l * w
    return "The perimeter is ${String.format("%.2f",area)}"
}