package practiceactivities

fun main(){
    var grade :Int = 0
    println("Please Enter your Exam Score:")
    grade = readln().toInt()

    if(grade >= 90){
        println("Your Grade is A")
    }else if(grade >= 80){
        println("Your Grade is B")
    }else if(grade >=70){
        println("Your Grade is C")
    }else if(grade >= 60){
        println("Your Grade is D")
    }else if(grade < 60){
        println("Your Grade is F")
    }

}