package prac_10_20

fun main(){
    println("Enter weight in Kg")
    val weight = readln().toDouble()
    println("Enter height in meter")
    val height = readln().toDouble()

    val bmi = weight/(height*height)
    println("BMI: %.2f".format(bmi))
}