package prac_10_20

fun main(){
    println("Enter The Price")
    val price = readln().toDouble()
    println("Enter The DisCount of Price")
    val discount = readln().toDouble()

    val discountPrice = (price * discount)/100

    val finalprice = price - discountPrice

    println("""
        Price: $price
        Discount: $discount
        Discount Price: $discountPrice
        Final price: %.2f
        """.trimIndent().format(finalprice))

}