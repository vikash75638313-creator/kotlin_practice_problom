package prac_30_40

fun main() {
    print("Enter Positive Number: ")
    val inputnimber = readln().toInt()

    if (inputnimber >= 0) {
        for (i in inputnimber downTo 1) {
            println(i)
        }
        println("Go!")
    }else {
        println("Invalid Number")
    }
}

/*Enter Positive Number: 8
8
7
6
5
4
3
2
1
Go!*/
