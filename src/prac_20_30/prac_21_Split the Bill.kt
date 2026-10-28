package prac_20_30

fun main(){
    println("Enter Total Price")
    val totalPrice = readln().toDouble()

    println("Enter Total Person")
    val totalNumberOfPerson = readln().toInt()

    if(totalNumberOfPerson <=0 ){
        println("Invalid Number of People")
    }else {
        val perPersonAmount = totalPrice / totalNumberOfPerson
        println("Per Person Pay Bill: %.2f".format(perPersonAmount))
    }
}