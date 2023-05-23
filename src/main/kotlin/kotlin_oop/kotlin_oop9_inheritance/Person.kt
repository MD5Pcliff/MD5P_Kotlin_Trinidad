package kotlin_oop.kotlin_oop9_inheritance

open class Person { //open class - super class
    private var name:String = "Default Name"
    private var age :Int = 0

    fun setName(name:String){
        this.name = name
    }
    fun setAge(age:Int){
        this.age = age
    }
    fun getAge():Int{
        return age
    }
    fun getName():String{
        return name
    }
}