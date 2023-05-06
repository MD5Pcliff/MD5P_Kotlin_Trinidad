package practiceactivities

fun main(){
    print("Temperature in Celsius:")
    var c = readln().toDouble()
    println(convertTemperature(c))
}
fun convertTemperature(c:Double):String{
    var f = (c * 9 / 5) + 32
    return "Temperature in Fahrenheit = ${String.format("%.2f", f)}"
}