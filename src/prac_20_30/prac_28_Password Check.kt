package prac_20_30

fun main(){
    println("Enter Password")
    val passwordInput = readln()

//    if(passwordInput.length >= 1 && passwordInput.length >= 8) {
    if(passwordInput.length >= 8) {
        println("Password Accepted")
    }else {
            println("Password Too Short")
        }
}


/*Enter Password
vikash@123
Password Accepted

Process finished with exit code 0*/



