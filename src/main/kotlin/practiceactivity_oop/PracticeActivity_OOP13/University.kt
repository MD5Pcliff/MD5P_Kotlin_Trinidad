package practiceactivity_oop.PracticeActivity_OOP13

class University {
    val uName :String
    constructor(uName:String){
        this.uName = uName
    }

    inner class Student{
      val name :String
      val id :Int

      constructor(name:String , id:Int){
          this.name = name
          this.id = id
      }
    }

}