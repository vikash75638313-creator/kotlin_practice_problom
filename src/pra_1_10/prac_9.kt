package pra_1_10

fun main(){
    print("Enter The List Of Number: ")
    val count = readln().toInt()
    var sum = 0
    for(i in 1..count){
        print("Enter the Number: ")
        val n = readln().toInt()
        sum = sum + n
    }
    println(sum)
}