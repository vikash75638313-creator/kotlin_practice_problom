package prac_10_20

fun main(){
    print("Enter The Row: ")
    val row = readln().toInt()

    print("Enter The Column: ")
    val column = readln().toInt()

    for(i in 1 ..row){
        for (j in 1..column){
            if(i==1){
                print("*")
            }else if(i==row){
                print("*")
            }else if(j==1){
                print("*")
            }else if(j==column){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}




/*
Enter The Row: 15
Enter The Column: 12
************
*          *
*          *
*          *
*          *
*          *
*          *
*          *
*          *
*          *
*          *
*          *
*          *
*          *
************

Process finished with exit code 0*/
