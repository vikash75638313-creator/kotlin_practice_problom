package prac_30_40

fun main(){

    print("Enter The Total Amount: ")
    val totalamount = readln().toDouble()

    print("Enter The Tip Percentage: ")
    val percentage = readln().toDouble()

    val tipamount = ( totalamount * percentage ) / 100
    val finalAmout = totalamount + tipamount


    if(totalamount > 0 && percentage > 0 && percentage < 100) {

        println("Tip Amount: %.2f".format(tipamount))
        println("Final Amount: %.2f".format(finalAmout))
    } else {
        println("Invalid Input")
    }

}


/*
Enter The Total Amount: 5000
Enter The Tip Percentage: 30
Tip Amount: 1500.00
Final Amount: 6500.00
*/
