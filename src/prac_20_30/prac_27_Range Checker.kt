package prac_20_30

fun main(){
    println("Enter Number to check")
    val numberToCheck = readln().toInt()

    println("Enter number for lower Limit of Range")
    val lowerLimit = readln().toInt()

    println("Enter number for Higher Limit of Range")
    val upperLimit = readln().toInt()

    if(numberToCheck >= lowerLimit && numberToCheck <= upperLimit){
        println("Inside Range")
    }else {
            println("OutSide Range")
        }
}



/*
Enter Number to check
18
Enter number for lower Limit of Range
10
Enter number for Higher Limit of Range
20
Inside Range*/
