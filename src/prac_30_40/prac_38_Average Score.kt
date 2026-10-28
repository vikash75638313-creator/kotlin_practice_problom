package prac_30_40

fun main(){

    print("Enter Number Of Score: ")
    val numberofscore = readln().toInt()

    if (numberofscore <= 0){
        println("Invalid Input")
        return
    }

    var total = 0.0

    for (i in 1.. numberofscore){

     val score = readln().toDouble()

        if (score >= 0 && score <= 100 ){

            total  = total + score


        } else {
            println("Invalid Score")
            return
        }

    }
    val average = total / numberofscore

    println("Average Score: %.2f".format(average))
}



/*
Enter Number Of Score: 5
78
45
56
98
75
Average Score: 70.40
*/

