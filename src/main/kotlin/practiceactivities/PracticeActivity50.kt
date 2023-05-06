package practiceactivities

fun main(){
    print("Weight in Kg:")
    var w = readln().toDouble()
    print("Height in m:")
    var h = readln().toDouble()
    val displayBMI = {w:Double,h:Double -> w/(h*h)}
    println("${String.format("%.2f",displayBMI(w,h))}")
}
//fun bmi(w:Double, h:Double):String{
//    var bmi = w/(h*h)
//    return "BMI = ${String.format("%.2f",bmi)}"
//}