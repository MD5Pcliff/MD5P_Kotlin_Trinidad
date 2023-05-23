package CaseStudy2

class NonFictionCategory(private var name:String):Category(name) {
    override fun displayCategory() {
        println("The category is $name")
    }
}