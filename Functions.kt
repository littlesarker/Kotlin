fun main(args: Array<String>) {

    rahim(11)
    rahim(22)
    rahim(33)
    rahim(44)

    string("Rahim", 21)
    var rr = sum(100, 200)

    println(rr)

}

fun rahim(xy: Int) {
    var res = xy + 10
    println(" " + res)
}

fun string(nam: String, year: Int) {
    println(nam + " is my name and i am " + year + " old")
}

fun sum(x: Int, y: Int): Int {
    return (x + y)
}