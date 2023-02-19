fun main(args: Array<String>) {

 var i=0
    while(i<10){
        print(""+i)
        i++
    }
println()
    //break
    var j=0
    while(j<10)
    {
        j++
        println(j)
        if(j==5){
            break
        }
    }
//continue
    var k=0
    while(k<10)
    {
       if(k==6) {
           k++
           continue
       }
        println(k)
    k++
    }


}

