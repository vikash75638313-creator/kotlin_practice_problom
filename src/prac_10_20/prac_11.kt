package prac_10_20

fun main(){
    println("Enter name of item")
    val name = readln()
    println("Enter Total Quantity of item")
    val quantity = readln().toInt()
    println("Enter Price of item")
    val pricePerItem = readln().toDouble()

    val totalCost = quantity * pricePerItem

    println("""Item name:$name
        |Total Quantity:$quantity
        |Per item Price:$pricePerItem
        |Total Cost:$totalCost""".trimMargin())
}