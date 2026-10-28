package pra_1_10

fun main(){
    val table = readln().toInt()

    for (i in 1..10){
        val result = table * i
        println("$table * $i = $result")
    }
}