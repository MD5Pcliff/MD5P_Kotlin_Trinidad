package practiceactivities

fun main(){
    var ctrl1 = 0
    while(ctrl1 < 5){
        var ctrl2 = 5
        while(ctrl2 > ctrl1){
            print("*")
            ctrl2--
        }
        println()
        ctrl1++
    }
}
