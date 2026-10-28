package prac_20_30

fun main(){
    println("Enter The Number")
    val numb = readln().toInt()

    if (numb == 0){
        println("Zero")
    }else if (numb > 0){
        println("Positive")
    }else if (numb < 0){
        println("Negative")
    }
}

/*
Enter The Number
0
Zero

Process finished with exit code 0*/
