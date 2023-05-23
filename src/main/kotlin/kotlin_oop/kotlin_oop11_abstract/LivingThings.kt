package kotlin_oop.kotlin_oop11_abstract

abstract class LivingThings {
    private var specie:String
    init{
        specie = ""
    }
    fun breath(){
        println("A living thing breathes")
    }
    abstract fun walk()
}