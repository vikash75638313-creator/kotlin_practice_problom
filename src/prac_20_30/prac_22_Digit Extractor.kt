package prac_20_30

fun main(){
    println("Enter Three Digit Number")
    val number = readln().toInt()
    //456
    val onesDigit = number%10
    val tensdDigit = (number/10)%10
    val hundreddDigit = number/100

    println(""" 
         Ones Digit: $onesDigit
         Tens Digit: $tensdDigit 
         Hundred Digit: $hundreddDigit
    """.trimIndent())
}