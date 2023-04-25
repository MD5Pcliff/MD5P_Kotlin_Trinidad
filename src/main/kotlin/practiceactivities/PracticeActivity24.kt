package practiceactivities

fun main(){
    var num = listOf<Int>(2, 4, 6, 8, 10)
    println("Number   Square   Cube")

    var ctrl :Int = 0
    var square :Int = 0
    var cube :Int = 0
    while(ctrl < num.size) {
        println("${num[ctrl]}        ${(num[ctrl]) * (num[ctrl])}        ${(num[ctrl]) * (num[ctrl]) * (num[ctrl])}")
        square = square+((num[ctrl]) * (num[ctrl]))
        cube = cube + ((num[ctrl]) * (num[ctrl]) * (num[ctrl]))
        ctrl++
    }
    println("Total    $square      $cube")

}