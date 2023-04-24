fun main(){
    var num = mutableListOf<Int>(25, 20, 15, 10, 5)
    var ctrl = 0
    while(ctrl < num.size){
        println("${num[0]-ctrl}  ${num[1]-ctrl}  ${num[2]-ctrl}  ${num[3]-ctrl}  ${num[4]-ctrl}")
        ctrl++
    }


}