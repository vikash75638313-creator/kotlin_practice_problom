package prac_30_40

// Method 1

/*fun main(){
    print("Enter The Positive Number: ")
    val inputnumber = readln().toInt()

    if( inputnumber > 0){

        var intialsum  = 0

        for (i in 1 .. inputnumber){

          intialsum  =  intialsum + i


        }
      println("Sum: $intialsum")

    } else {
        println("Invalid Number")
    }
}*/

/*Enter The Positive Number: 4
Sum: 10*/


// Method 2
fun main(){
    print("Enter The Positive Number: ")
    val inputnumber = readln().toInt()

    if( inputnumber > 0){

        val sum = inputnumber * (inputnumber + 1) / 2
        println("Sum: $sum")

    } else {
        println("Invalid Number")
    }
}


/*
Enter The Positive Number: 5
Sum: 15*/
