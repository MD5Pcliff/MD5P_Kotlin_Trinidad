package kotlin_oop.kotlin_oop8_encapsulation
fun main(){
    //encapsulation/ information hiding
    //object variables/member - cannot be accessed directly
    //but can be access via setter  and getter methods
    //access modifiers
    var person = Person()
    person.setName("Peter")
    person.setAge(21)

    println(person.getName())
    println(person.getAge())
}