package prac_30_40
import kotlin.math.pow

fun main(){

 print("Enter An base Number: ")
 val basenumber = readln().toDouble()

 print("Enter An Exponent Number: ")
 val exponent = readln().toInt()

 if( exponent >= 0){
   val result = basenumber.pow(exponent).toInt()
  println("Final Answer: $result")
 } else {
  println("Invalid Exponent")
 }
}


/*

Enter An base Number: 2
Enter An Exponent Number: 5
Final Answer: 32

*/
