package CaseStudy2
open class User(private var name:String , private var email:String ) {
    fun setName(name:String){
        this.name = name
    }
    fun setEmail(email:String){
        this.email = email
    }
    fun getName():String{
        return name
    }
    fun getEmail():String{
        return email
    }
    fun displayInfo(name:String , email: String){
        println("The username is: $name")
        println("The email is: $email")
    }
}