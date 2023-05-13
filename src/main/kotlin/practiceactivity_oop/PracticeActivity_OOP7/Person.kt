package practiceactivity_oop.PracticeActivity_OOP7

class Person {
    var name: String
    var age: Int

    constructor(){
        name = "Default Name"
        age = 0
    }

    constructor(name:String , age:Int){
        this.name = name
        this.age = age
    }
}
