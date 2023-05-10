package kotlin_basics

fun main(){
    var ctrl1 = 0
    while(ctrl1 < 8){
        var ctrl2 = 0
        while(ctrl2 < 4){
            print("*")
            ctrl2++
        }
        println()
        ctrl1++
    }
}