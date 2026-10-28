package prac_10_20

fun main(){
    println("Enter Name")
    val name = readln()
    println("Enter Age")
    val age = readln().toInt()
    println("Enter City")
    val city = readln()
    println("Enter Email")
    val email = readln()

    println("""
        |----- Personal Information -----
        |Name: $name
        |Age: $age
        |City: $city
        |Email Address: $email
        |""".trimMargin())
}