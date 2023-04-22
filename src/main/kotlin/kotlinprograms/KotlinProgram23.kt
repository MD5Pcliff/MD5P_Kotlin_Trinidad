fun main(){
    //arraylist
    var names = ArrayList<String>()
    println("Enter Name 1")
    names.add(readln())
    println("Enter Name 2")
    names.add(readln())
    println("Enter Name 3")
    names.add(readln())

    var ctrl :Int = 0
    while(ctrl < names.size) {
        println(names[ctrl])
        ctrl++
    }
}