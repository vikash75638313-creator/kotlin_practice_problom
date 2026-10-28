package prac_20_30



fun main(){
    println("Enter The Ticket Category: Infant, Child, Adult,Senior Citizen")
    val ticketCategory = readln()

    println("Enter Age Of Customer")
   val age = readln().toInt()

    if (age >=0 && age <=5){
        println("Ticket Price: Rs=Free")
    } else  if (age >=6 && age <=12){
        println("Ticket Price: Rs=100")
    }else  if (age >=13 && age <=59){
        println("Ticket Price: Rs=250")
    } else  if (age >=60){
        println("Ticket Price: Rs=150")
    } else{
        println("invalide Age")
    }
}


/*Enter The Ticket Category: Infant, Child, Adult,Senior Citizen
Adult
Enter Age Of Customer
45
Ticket Price: Rs=250

Process finished with exit code 0*/







