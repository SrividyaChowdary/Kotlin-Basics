fun main(){
    var sum = 0;
    for (i in 1..100){
        sum += i
    }
    println(sum)

    val listOf = listOf("fghjk", "dfghj", "dfgh")
    for(element in listOf){
        println(element)
    }

    // index with value
    for((index, value) in listOf.withIndex()){
        println("element with $index is $value")
    }

    for (char in "vidya sri"){
        println(char)
    }
}