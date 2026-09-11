package W01

fun main() {
    print("Enter your age as a whole number: ")
    val age = readLine()!!.toInt()
    if (age >= 18 && age < 40) {
        println("You can go into the club")
    } else if (age < 18 && age > 40) {
        println("You can't get into the club , Go Home.")
    } else {
        println("Invalid age")
    }

    if (age in 18..39) {
        println("You can get into the club")
    }
}