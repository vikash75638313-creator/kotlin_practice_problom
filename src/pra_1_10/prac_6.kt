package pra_1_10




//fun main(){
//    val Score = readln().toInt()
//    if (Score < 0 || Score > 100){
//        println("Invalide")
//    }else if(Score>=90){
//        println("A")
//    }else if(Score>=80){
//        println("B")
//    }else if(Score>=70){
//        println("C")
//    }else if(Score>=60){
//        println("D")
//    }
//    else {
//        println("F")
//    }
//
//}


fun main(){
    val score = readln().toInt()

    when{
        score <0 || score >100 -> println("Invalid Score")
        score >= 90 -> println("Grade A")
        score >= 80 -> println("Grade B")
        score >= 70 ->  println("Grade C")
        score >= 60 ->  println("Grade D")
        score <59   ->   println("Grade F")
    }
}





