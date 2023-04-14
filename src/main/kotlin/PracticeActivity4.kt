import javax.swing.InputMap

fun main(){
    //Input
    var birth = 0
    var current = 0
    var age = 0

    //Process
    println("Enter Name:")
    var name :String = readln()
    println("Enter Year of Birth:")
    birth = readln().toInt()
    println("Enter Current Year:")
    current = readln().toInt()

    //age = current - birth
    age = current - birth

    println("$name your current age is = $age")

}