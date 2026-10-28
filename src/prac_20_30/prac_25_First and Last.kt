package prac_20_30

fun main(){
    println("Enter The Character")
    val singleWord = readln()
    println("""
      First Character: ${singleWord[0] }
      Last Character: ${singleWord[singleWord.length-1]}
        """.trimIndent()
    )
}



//Enter The Character
//vikash
//First Character: v
//Last Character: h
//
//Process finished with exit code 0