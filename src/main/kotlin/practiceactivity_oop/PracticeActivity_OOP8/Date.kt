package practiceactivity_oop.PracticeActivity_OOP8

class Date {
    var day :Int
    var month :String
    var year :Int

    constructor(){
        day = 1
        month = "January"
        year = 1000
    }

    constructor(day:Int , month:String , year:Int){
        this.day = day
        this.month = month
        this.year = year
    }
}