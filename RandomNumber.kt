import java.util.*
/**
 * Problem statement:
 * Generate a random number between 1 and 50 using the following code:
val random = Random().nextInt(50) + 1
IntelliJ helps you import the Random class from Java so that you can use it. Don’t
worry about the details of imports for now.
Now, use a when statement to switch between the cases where random is in
the range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40. In each case, print out
a message containing the range and the exact value of random.
 */
fun main() {
    val random = Random().nextInt(50) + 1
    when (random){
        in 1..10 -> {
            println("in range between 1 to 10")
            println(random)
        }
        in 10..20 -> {
            println("in range between 10 to 20")
            println(random)
        }
        in 20..30 -> {
            println("in range between 20 to 30")
            println(random)
        }
        in 30..40 -> {
            println("in range between 30 to 40")
            println(random)
        }
        else -> {
            println("range is above 40")
            println(random)
        }

    }
}