fun main(){
    var ctrl1 = 1
    while(ctrl1 <= 5) {
        var ctrl2 = 1
        while (ctrl2 <= ctrl1) {
            print("$ctrl2")
            ctrl2++
        }
        println()
        ctrl1++
    }
}
