fun main(args: Array<String>) {

    //Make a Array arrayof()

    val rahim= arrayOf("My","name","is ","Rahim ","Sarker")

    //access index
    println(rahim[0])

    //Change index value
    rahim[2]="MD"
    println(rahim[2])

    //Array Size
    println(rahim.size)

    //Search in Array
    if ("Abu" in rahim){
        println("Exist in Array")
    }else{
        println("No Exist")
    }

    //print array
    for (xy in rahim){
        print(xy+" ")
    }

}