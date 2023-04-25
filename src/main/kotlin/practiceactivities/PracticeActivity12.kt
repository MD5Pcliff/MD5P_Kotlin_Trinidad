package practiceactivities

fun main(){
    var fareamount :Int = 0
    println("Please Enter Fare Amount:")
    fareamount = readln().toInt()
    println("Please Enter Fare Code:")
    var farecode = readln()
    println("Travelling in Business Class?[Y/N]")
    var BusinessClass = readln()
    when(farecode){
        "O" -> {
            when (BusinessClass) {
                "Y" -> {
                    println("No Discount")
                    println("Business Class Charge is 1000")
                    println("New Fare is ${fareamount + 1000}")
                }

                else -> {
                    println("No Discount")
                    println("No Business Class Charge")
                    println("New Fare is $fareamount")
                }
            }
        }
        "S" -> {
            when(BusinessClass){
                "Y" -> {
                    println("Discount of ${fareamount*.05}")
                    println("Business Class Charge is 700")
                    println("New Fare is ${fareamount-(fareamount*.05)+700}")
                }else -> {
                println("Discount of ${fareamount*.05}")
                println("No Business Class Charge")
                println("New Fare is ${fareamount-(fareamount*.05)}")
                }
            }
            }
        "C" -> {
            when(BusinessClass){
                "Y" -> {
                    println("Discount of ${fareamount*.1}")
                    println("Business Class Charge is 500")
                    println("New Fare is ${fareamount-(fareamount*.1)+500}")
                }else ->{
                println("Discount of ${fareamount*.1}")
                println("No Business Class Charge")
                println("New Fare is ${fareamount-(fareamount*.1)}")
                }
            }
        }
        }
    }
