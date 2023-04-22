fun main(){
    var a :Int = 0
    var b :Int = 0
    var c :Int = 0

    println("Enter Number 1:")
    a = readln().toInt()
    println("Enter Number 2:")
    b = readln().toInt()
    println("Enter Number 3:")
    c = readln().toInt()

    if(((a*a)+(b*b)) == (c*c)){
        println("These numbers form a Pythagorean Triple")
    }else{
        println("These numbers does not form a Pythagorean Triple")
    }
}