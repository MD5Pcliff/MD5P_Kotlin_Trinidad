fun main(){
    var year :Int = 0
    println("Please Enter a Year:")
    year = readln().toInt()

    if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
        println("$year is a Leap Year")
    }else{
        println("$year is not a Leap Year")
    }
}