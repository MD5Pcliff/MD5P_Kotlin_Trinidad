package CaseStudy2
class Customer(private var name:String, private var email:String ):User(name, email) ,Discountable{
    override fun applyDiscount() {
        println("Applying 5% discount to customer $name")
    }
}