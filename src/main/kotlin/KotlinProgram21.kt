fun main(){
    //only strings
    var names = arrayOf<String>("Paul" , "John" , "Ringo" , "George")
    //any data type
    //var names = arrayOf("Paul" , "John" , "Ringo" , "George")
    println("array size is ${names.size}")//showing size of array
    var ctrl :Int = 0
    while(ctrl < names.size){
        println(names[ctrl])
        ctrl++

    }

}