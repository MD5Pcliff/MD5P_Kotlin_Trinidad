package practiceactivity_oop.PracticeActivity_OOP4

class BankAccount(var accountNumber:String , var balance:Int) {
    fun deposit(input:Int){
        balance += input
        println("The new balance for account number $accountNumber is $balance")
    }
    fun withdraw(input:Int){
        balance -= input
        println("The new balance for account number $accountNumber is $balance")
    }
}