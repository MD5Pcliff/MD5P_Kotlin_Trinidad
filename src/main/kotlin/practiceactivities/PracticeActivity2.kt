import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main(){
    var length :Double = 0.0
    var width :Double = 0.0
    var perimeteroftriangle :Double = 0.0


    println("Enter length: ")
    length = readln().toDouble()
    println("Enter width:")
    width = readln().toDouble()

    println("Perimeter = ${String.format("%.2f",(2*length)+(2*width))}")
    println("Area is = ${String.format("%.2f",(length*width))}")
}