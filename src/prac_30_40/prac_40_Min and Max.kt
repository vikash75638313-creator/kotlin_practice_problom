package prac_30_40

fun main(){
    print("Enter The Number Of Elements: ")
    val listOfNumber = readln().toInt()

    if (listOfNumber <=0){
        println("Invalid Input")
        return
    }
    val number = IntArray(listOfNumber)

    println("Enter List Of Number")
    for (i in 0 until listOfNumber){
        number[i] = readln().toInt()
    }
    var minimum = number[0]
    var maximum  = number[0]

    for (i in 1 until listOfNumber){
        if (number[i] < minimum){
            minimum = number[i]
        }
        if (number[i] > maximum){
            maximum = number[i]
    }
    }
    println("Minimum: $minimum")
    println("Minimum: $maximum")
}





/*
Enter The Number Of Elements: 5
Enter List Of Number
10
20
30
40
50
Minimum: 10
Minimum: 50
*/
