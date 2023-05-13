package kotlin_oop.kotlin_oop2_sampleapplication

fun main(){
    var myPhone = MobilePhone(10)
    myPhone.checkBalance()
    myPhone.load(30)
    myPhone.checkBalance()
    myPhone.sendTextMessage("Wer na U?")
    myPhone.sendTextMessage("D2 na me")
    myPhone.checkBalance()
    myPhone.displayLogs()

}