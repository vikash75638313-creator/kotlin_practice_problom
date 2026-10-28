package prac_30_40

fun main(){

    print("Enter Number Of Elements: ")
    val listOfNumber = readln().toInt()

    if (listOfNumber <= 0){
        println("Invalid Input")
        return
    }
    val number = IntArray(listOfNumber)

    println("Enter List Of Number")
    for (i in 0 until listOfNumber){
        number[i] = readln().toInt()
        }
    println("Enter Target Number")
    val target = readln().toInt()
    var count = 0

    for (i in 0 until listOfNumber){
        if (number[i] == target){
            count++
        }

    }
    println("Total Count: $count")
    }


/*
Enter Number Of Elements: 5
Enter List Of Number
10
20
10
30
50
Enter Target Number
10
Total Count: 2

*/


