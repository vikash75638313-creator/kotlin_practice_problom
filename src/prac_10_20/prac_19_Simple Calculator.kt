package prac_10_20



fun main(){

    println("Enter first Number")
    val firstnumber = readln().toDouble()

    println("Enter Secund Number")
    val secundnumber = readln().toDouble()

    println("Enter Chose One Operator: add,sub,multi,div")
    val operator = readln().lowercase()

    when(operator){
        "add" -> {
            val result = firstnumber + secundnumber
            println("Result: %.2f".format(result))
        }
        "sub" -> {
            val result = firstnumber - secundnumber
            println("Result: %.2f".format(result))
        }
        "multi" -> {
            val result = firstnumber * secundnumber
            println("Result: %.2f".format(result))
        }
        "div" -> {
            if (secundnumber == 0.0){
                println("Can not Divide By Zero")
            }else {
                val result = firstnumber / secundnumber
                println("Result: %.2f".format(result))
            }

        }
        else -> {
            println("Invalid Operator")
        }
        }
    }
