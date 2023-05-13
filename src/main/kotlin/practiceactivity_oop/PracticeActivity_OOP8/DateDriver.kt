package practiceactivity_oop.PracticeActivity_OOP8

fun main() {
    println("First Constructor")
    var date1 = Date()
    println("${date1.day} - ${date1.month} - ${date1.year}")

    println("Second Constructor")
    var date2 = Date(13,"May", 2023)
    println("${date2.day} - ${date2.month} - ${date2.year}")
}