package kotlin_oop.kotlin_oop3_normalclass

class Person {
    var name :String
    var age :Int

    constructor(){ //Primary constructor
        name = "Default Name"
        age = 0
    }

    //secondary constructor
    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }

    constructor(name:String){
        this.name = name
        this.age = 0
    }

    constructor(age:Int){
        this.name = "John"
        this.age = age
    }
}