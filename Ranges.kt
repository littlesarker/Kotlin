fun main(args: Array<String>) {

    //in for loop we can make range value with '..'

    for (n in 1..20) {
        print(" "+ n)
    }
    println()
    for (xyz in 'A'..'Z') {
        print(xyz + " ")
    }
    println()

   //break in Ranges
    for (abc in 1..5){
        if(abc==3){
            break
        }
        println(abc)
    }

    //continue in Ranges
    for (wx in 1..6){
        if (wx==3){
            continue
        }
        println(wx)
    }

}