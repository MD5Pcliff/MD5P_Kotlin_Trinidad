import practiceactivities.calculateArea
import practiceactivities.calculatePerimeter

fun main() {
    print("Enter Length:")
    var l = readln().toInt()
    print("Enter Width:")
    var w = readln().toInt()
    var perimeter = {l:Int, w:Int -> (2*l)+(2*w)
    }
    var area = {l:Int , w:Int -> l*w
    }
    println("The perimeter is ${perimeter(l,w)}")
    println("The area is ${area(l,w)}")
}