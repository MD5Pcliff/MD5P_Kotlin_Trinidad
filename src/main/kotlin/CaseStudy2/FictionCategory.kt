package CaseStudy2

class FictionCategory(private var name:String):Category(name) , Discountable {
    override fun displayCategory() {
        println("The Category is $name")
    }

    override fun applyDiscount(){
        println("Applying 10% discount for Fiction catergory")
    }
}