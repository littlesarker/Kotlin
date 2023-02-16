fun main(args: Array<String>) {

    //IF ELSE WHEN
    if (10 > 2) {
        println("Correct")
    } else {
        println("Wrong")
    }

    var a: Int = 101
    val b: Int = 100

    if (a > b) {
        println("Drunk")
    }

    var x = 0
    var y = 1
    val ans = if (x < y) {
        "true"
    } else {
        "false"
    }

    println(ans)

    //WHEN
    //The when expression is similar to the switch statement in Java.
    val num = 4
    val res = when (num) {
        1 -> "MD"
        2 -> "Rahim"
        3 -> "Sarker"
        4 -> "Hafsa"
        5 -> "Naznin"
        else -> "404"
    }
    println(res)


}