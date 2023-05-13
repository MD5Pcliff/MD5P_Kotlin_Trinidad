package practiceactivity_oop.PracticeActivity_OOP9

class Car {
    var make :String
    var model :String
    var year :Int

    constructor(){
        make = "Default Make"
        model = "Default Model"
        year = 1000
    }

    constructor(make:String, model:String, year:Int){
        this.make = make
        this.model = model
        this.year = year
    }
}