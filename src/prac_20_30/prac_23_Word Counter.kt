package prac_20_30

fun main(){
    println("Enter The Sentence")
    val sentence = readln().toString()

    val words = sentence.split("\\s+".toRegex()).filter { it.isNotEmpty() }

    println("Word count: ${words.count()}")
}

//Enter The Sentence
//Vikash Kumar Mandal Shivram
//Word count: 4
