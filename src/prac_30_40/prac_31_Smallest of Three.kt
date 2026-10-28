package prac_30_40

fun main() {
    println("Enter First Integer Number")
    val firstnumber = readln().toInt()

    println("Enter Second Integer Number")
    val secundnumber = readln().toInt()

    println("Enter First Third Number")
    val thirdnumber = readln().toInt()

    if (firstnumber <= secundnumber && firstnumber <= thirdnumber) {
        println("Smallest Number: $firstnumber")
    } else if (secundnumber <= firstnumber && secundnumber <= thirdnumber) {
        println("Smallest Number: $secundnumber")
    } else if (thirdnumber <= secundnumber && thirdnumber <= firstnumber) {
        println("Smallest Number: $thirdnumber")
    }
}


/*
Enter First Integer Number
5
Enter Second Integer Number
10
Enter First Third Number
2
Smallest Number: 2*/
