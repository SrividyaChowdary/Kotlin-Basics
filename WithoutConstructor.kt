class WithoutConstructor(var name: String, var place: String, var age: Int, var phoneNo: Long) {
//    var name: String
//    var place: String
//    var phoneNo: Long
//    var age: Int

//    init {
//        this.name = name
//        this.place = place
//        this.age = age
//        this.phoneNo = phoneNo
//    }

    fun getPhoneNumber(): Long{
        return phoneNo
    }

    fun getFatherName(name: String): String{
        return name
    }

    fun getYearOfBirth() = 2021 - age
}

fun main() {
    val person = WithoutConstructor("Vidya", "India", 24, 57890876567L)
    println(person.name)
    println(person.age)
    println(person.place)
    println(person.getFatherName("Father name"))
    println(person.getPhoneNumber())
    println(person.getYearOfBirth())
}