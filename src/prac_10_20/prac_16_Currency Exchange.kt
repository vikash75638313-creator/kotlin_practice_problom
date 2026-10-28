package prac_10_20

fun main(){
    println("Enter The Amount")
    val amount = readln().toInt()
    println("Enter The Exchange Rate")
    val rate = readln().toDouble()
    val convertedAmount = amount * rate
    println("Converted Amount: %.2f".format(convertedAmount))
}