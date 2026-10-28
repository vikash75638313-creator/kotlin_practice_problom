package pra_1_10

import kotlin.math.PI

fun main(){
    println("Chose the Shapes : Triangle , Rectangle, Circle")
    val shape = readln()

  when(shape){
      "rectangle" -> {
          val length = readln().toDouble()
          val width = readln().toDouble()
          val rectangleOfArea = length * width
          println("Area of Rectangle= $rectangleOfArea")
      }
      "triangle" -> {
         val base = readln().toDouble()
         val height = readln().toDouble()
         val triangleOfArea = 0.5 * base * height
          println("Area of Triangle = $triangleOfArea")
      }
      "circle" -> {
          val radius = readln().toDouble()
          val circleOfArea = PI * radius*radius
          println("Area of Circle = $circleOfArea")
      }
      else -> {println("Invalid")}
  }
}