fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    println(numbers.reversed()) // built-in function
    println(reverse(numbers))
    println(reverse1(numbers))
    println(reverse2(numbers))

}

// approach 1
fun reverse(input: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0..input.size-1){
        result.add(input.get(input.size-1-i))
    }
    return result
}

// approach 2
fun reverse1(input: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    println(input.indices) // 0..8
    for (i in input.indices){
        result.add(input[input.size-1-i])
    }
    return result
}

// approach 3
fun reverse2(input: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    println(input.indices) // 0..8
    for (i in input.size-1 downTo 0){
        result.add(input.get(i))
    }
    return result
}