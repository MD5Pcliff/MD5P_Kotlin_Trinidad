fun main(){
    println("Please Enter a String:")
    var name = readln()
    var ctl :Int = name.length
    while (ctl <= name.length ){
        ctl--
        if(ctl == -1)
            break
        print("${name[ctl]}")
    }

}