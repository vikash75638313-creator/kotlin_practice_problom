package pra_1_10


fun main(){
    print("Enter The Number: ")
    val number = readln().toInt()
    var fact = 1L
    for(i in 1..number){
        fact = fact * i
    }
    println(fact)
}
