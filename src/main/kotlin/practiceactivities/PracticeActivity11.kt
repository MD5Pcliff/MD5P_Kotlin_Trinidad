fun main(){
    println("Please Enter Name of Student:")
    var name = readln()
    println("Please Enter Grade in Physics:")
    var physics = readln().toDouble()
    println("Please Enter Grade in Algebra:")
    var algebra = readln().toDouble()
    println("Please Enter Grade in Programming:")
    var programming = readln().toDouble()
    var ave = (physics+algebra+programming)/3
    if(ave >= 95){
        println("$name average grade is ${String.format("%.2f",ave)}")
        println("Presidents Lister")
    }else if(ave >=89){
        println("$name average grade is ${String.format("%.2f",ave)}")
        println("Deans Lister")
    }else if(ave >=83) {
        println("$name average grade is ${String.format("%.2f", ave)}")
        println("Average Student")
    }else if(ave >=78) {
        println("$name average grade is ${String.format("%.2f", ave)}")
        println("Fair")
    }else if(ave < 78) {
        println("$name average grade is ${String.format("%.2f", ave)}")
        println("Failure")
    }else{
        println("Invalid Grade")
    }

}