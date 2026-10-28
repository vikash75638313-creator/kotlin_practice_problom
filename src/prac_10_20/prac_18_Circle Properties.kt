package prac_10_20

import kotlin.math.PI

fun main(){
    println("Enter Radius of Circle")
    val radius = readln().toDouble()

    val area = PI *radius*radius
    val circumference = 2*PI*radius

    println("""
            Area: %.3f
            Circumference: %.2f
    """.trimIndent().format(area ,circumference))
}