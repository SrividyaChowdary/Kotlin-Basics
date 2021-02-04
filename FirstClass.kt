class FirstClass {
    var name: String = "vidya"
    var place: String = "India"
    var phoneNo = 68789898779L
    var age: Int = 24

    fun getPhoneNumber(): Long{
        return phoneNo
    }

    fun getFatherName(name: String): String{
        return name
    }

    fun getYearOfBirth() = 2021 - age
}

fun main() {
    val person = FirstClass()
    println(person.name)
    println(person.age)
    println(person.place)
    println(person.getFatherName("Father name"))
    println(person.getPhoneNumber())
    println(person.getYearOfBirth())
}