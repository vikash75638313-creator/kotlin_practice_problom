package prac_10_20

fun main(){
    println("Enter The First Number")
    var FirstNumber = readln().toInt()
    println("Enter The Secund Number")
    var SecundNumber = readln().toInt()
    val SwapValue = FirstNumber
        FirstNumber = SecundNumber
        SecundNumber = SwapValue

    println("""
        First num:$FirstNumber
        Secund num:$SecundNumber
        """.trimIndent())
}