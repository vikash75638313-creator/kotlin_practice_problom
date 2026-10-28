package prac_20_30

fun main(){
    println("Enter The Text")
    val char = readln()

    println("""
          UperCase: ${char.uppercase()}
          Length: ${char.count()}
    """.trimIndent())
}


//Enter The Text
//Vikash Kumar Mandal
//UperCase: VIKASH KUMAR MANDAL
//Length: 20