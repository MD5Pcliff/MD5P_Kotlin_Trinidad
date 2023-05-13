package practiceactivity_oop.PracticeActivity_OOP10

class BankAccount {
    var accountNumber :String
    var balance :Int

    constructor(){
        accountNumber = "0000000000000"
        balance = 0
    }

    constructor(accountNumber:String, balance:Int){
        this.accountNumber = accountNumber
        this.balance = balance
    }
}