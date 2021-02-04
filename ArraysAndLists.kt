
fun main(){
    // Arrays
    val arrays = arrayOf("Texas", "India", "andhra pradesh")
    val integers = intArrayOf(1,1,1,1,1,1,1,1,)
    val states = arrayOf("ab", "bc", "cd")
    //concatenation
    val mixed = arrays+states
    println(integers)
    println(mixed.contentToString())
    println(mixed.contains("bc"))
    println(mixed.isEmpty())

    //List
    val list = arrayListOf<String>("hihi", "ujfjufjh","fgh","dfghj","rtyujkl")
    list.add("new element")
    println(list)
    list.remove("hihi") // removing element from the list
    println(list)
    //sub list
    println(list.subList(1, 4))  // 1-4=3 this will print 3 elements [fgh, dfghj, rtyujkl]

}