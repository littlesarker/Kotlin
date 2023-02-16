fun main(args: Array<String>) {

    var txt="Hello world"

    print(txt[1])
    println(txt[0])

    var str="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(str.length)

    println(str.lowercase())

    println(txt.compareTo(str))

    println(txt.indexOf("world"))

    println(txt+" "+str)

    var fname:String="Md "
    var lname:String="Rahim"
    println(fname.plus(lname))

    //We can use $ symbol for variable expression inside String

    println("I Am $fname $lname Sarker")

}