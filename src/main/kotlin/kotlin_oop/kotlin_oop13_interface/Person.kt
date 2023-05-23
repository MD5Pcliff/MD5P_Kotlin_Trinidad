package kotlin_oop.kotlin_oop13_interface

class Person :Singer , Dancer {
    private var name:String
    init{
        name = "Default Name"
    }
    fun setName(name:String){
        this.name = name
    }
    fun getName():String{
        return name
    }

    override fun sing() {
        println("The person sings")
    }

    override fun dance() {
        println("The person dance")
    }

}