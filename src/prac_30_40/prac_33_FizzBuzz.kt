package prac_30_40

fun main(){

    print("Enter a positive Number: ")
    val inputnumber = readln().toInt()

    if ( inputnumber > 0){
        for (i in 1 .. inputnumber){
            if (i % 3 == 0 && i % 5 == 0){
                println("FizzBuzz")
            } else if (i % 3 == 0){
                println("Fizz")
            } else if (i % 5 == 0){
                println("Buzz")
            } else {
                println(i)
            }
        }
    } else {
        println("Invalid Number")
    }
}




/*
Enter a positive Number: 15
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz*/
