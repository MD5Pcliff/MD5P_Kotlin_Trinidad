fun main(){
    //Data
    var cashdiscount = 0.0
    var installment = 0.0
    var threeinstallment = 0.0

    //Process
    println("Enter Name of Student:")
    var name :String = readln()
    println("Enter Number of Units Enrolled:")
    var units = readln().toDouble()
    println("Price per Unit is:")
    var price = readln().toDouble()

    var tuition = units * price

    println("$name You could avail the following payment mode")

    println("Computed Tuition Fee = ${String.format("%.2f",tuition)}")

    println("Payment mode")

    //cash discount computation = tuition - tuition*.1

    cashdiscount = tuition - (tuition*.1)
    println("Your Tuition if Cash Payment = ${String.format("%.2f",cashdiscount)}")

    //installment computation = tuition + tuition*.05
    installment = tuition + (tuition*.05)
    println("Your Tuition if Two Installment = ${String.format("%.2f",installment)}")

    threeinstallment = tuition + (tuition*.1)
    println("Your Tuition if Three Installment = ${String.format("%.2f",threeinstallment)}")

}