fun main(){
    //Inputs
    var day1 = 39.99
    var day2 = 40.02
    var day3 = 38.97
    var average = 0.0

    //Process
    //Avarage = (Sum of All numbers)/(Number of Items)
    println("Gasoline")
    average = (day1+day2+day3)/3
    println("The average price of gasoline is = ${(String.format("%.2f", average))}")


}