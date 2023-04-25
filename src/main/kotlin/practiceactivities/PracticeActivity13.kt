package practiceactivities

fun main(){
    var weight :Double = 0.0
    var height :Double = 0.0

    println("Please Enter Weight in Kgs:")
    weight = readln().toDouble()
    println("Please Enter Height in Meters:")
    height = readln().toDouble()
    var BMI:Double = (weight/(height*height))

    if(BMI >= 30){
            println("Your BMI is ${String.format("%.2f",BMI)}, which means you are Obese")
    }else if(BMI > 24.9){
            println("Your BMI is ${String.format("%.2f",BMI)}, which means you are Overweight")
    }else if(BMI > 18.5){
        println("Your BMI is ${String.format("%.2f",BMI)}, which is in the Normal Weight Range")
    }else if(BMI <= 18.5){
        println("Your BMI is ${String.format("%.2f",BMI)}, which means your Underweight")
    }

}