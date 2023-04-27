package practiceactivities

fun main(){
    //input of data
    println("Please Enter a String:")
    var name = readln()
    var ctl :Int = name.length
    //process
    while (ctl <= name.length ){
        ctl--
        if(ctl == -1)
            break //to end the process when condition is met
        print("${name[ctl]}")
    }

}