package kotlin_oop.kotlin_oop11_abstract

class Dog :LivingThings() {
    private var name:String
    private var breed:String

    init{
        name = ""
        breed = ""
    }
    fun setName(name:String){
        this.name = name
    }
    fun getName():String{
        return name
    }
    fun setBreed(breed:String){
        this.breed = breed
    }
    fun getBreed():String{
        return breed
    }

    override fun walk() {
        println("A dog walks on 4 legs")
    }
}