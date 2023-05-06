package practiceactivities

fun main(){
    print("Enter Length:")
    var l = readln().toDouble()
    print("Enter Width:")
    var w = readln().toDouble()
    println((l add w))
    println(l multiply w)

}

infix fun Double.add(w:Double):Double{
    return 2*this+(+w+w)
}
infix fun Double.multiply(w:Double):Double{
    return this*w

}
//fun calculatePerimeter(l:Double , w:Double):String{
//    var perimeter = l+l+w+w
//    return "The perimeter is ${String.format("%.2f",perimeter)}"
//}
//fun calculateArea(l:Double , w:Double):String {
//    var area = l * w
//    return "The perimeter is ${String.format("%.2f",area)}"
//}