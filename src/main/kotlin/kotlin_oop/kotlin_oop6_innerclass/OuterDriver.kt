package kotlin_oop.kotlin_oop6_innerclass
fun main(){
    val outerObject = Outer()
    val innerObject = outerObject.Inner()
    innerObject.callOuter()

}