fun main(){
    var defaultusername :String = "admin"
    var defaultpassword :String = "pas123"

    //log-in
    println("Enter Username:")
    var username = readln()
    println("Enter Password:")
    var password = readln()

    //test if credential is correct
    if((username ==defaultusername) && (password == defaultpassword)){
        println("Logged In!")
    }else{
        println("Invalid Username or Password")
    }
}