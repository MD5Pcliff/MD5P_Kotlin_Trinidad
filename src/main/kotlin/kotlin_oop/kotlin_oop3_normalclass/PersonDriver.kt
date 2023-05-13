package kotlin_oop.kotlin_oop3_normalclass
fun main(){
    println("First Constructor")
    var person1 = Person()
    println(person1.name)
    println(person1.age)

    println("Second Constructor")
    var person2 = Person("Peter", 21)
    println(person2.name)
    println(person2.age)

    println("Third Constructor")
    var person3 = Person("Cliff")
    println(person3.name)
    println(person3.age)

    println("Fourth constructor")
    var person4 = Person(10)
    println(person4.name)
    println(person4.age)


}