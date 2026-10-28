package prac_10_20

fun main(){
    println("Enter the Message")
    val message = readln()

    println("How Many times Repeat")
    val times = readln().toInt()

    for(i in 1..times){
        println(message)
    }
}