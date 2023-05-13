package practiceactivity_oop.PracticeActivity_OOP10

import practiceactivity_oop.PracticeActivity_OOP4.BankAccount

fun main(){
    println("First Constructor")
    var bank1 = BankAccount()
    println("Account Number = ${bank1.accountNumber}")
    println("Balance = ${bank1.balance}")

    println("Second Constructor")
   var bank2 = BankAccount("123456789145" , 1000000)
    println("Account Number = ${bank2.accountNumber}")
    println("Balance = ${bank2.balance}")
}