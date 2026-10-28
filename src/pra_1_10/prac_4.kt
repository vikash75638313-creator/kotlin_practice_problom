package pra_1_10

fun main(){
    val firstname = readln()
    val lastname = readln()

    val username = (firstname.substring(0,3) + lastname.substring(0,3)).lowercase()

    // first method
  //  val initials = "${firstname[0]}${lastname[0]}".uppercase()
    // 2nd method
    val initials = (firstname[0].toString() + lastname[0].toString()).uppercase()
    println(username)
    println(initials)
}