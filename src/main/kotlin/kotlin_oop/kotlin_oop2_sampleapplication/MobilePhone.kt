package kotlin_oop.kotlin_oop2_sampleapplication

class MobilePhone(var load:Int) {
    var messageLogs = mutableListOf<String>()
    var textMessageCount = 0

    fun sendTextMessage(message:String){
        load--
        textMessageCount++
        println("Message Sent!")
        messageLogs.add("Message:$message , ${System.currentTimeMillis()}")
    }

    fun load(amount:Int){
        load += amount
        println("Loaded Successfully!")
    }

    fun checkBalance(){
        println("Your account balance is $load")
    }

    fun displayLogs(){
        println("Number of text message sent $textMessageCount")
        println(messageLogs)
    }

}