package W01

fun main() {
    val num1 = 5
    val num2 = 4

    if (num1 > 0 || num2 > 7) {
        println("This condition is true")
    } else {
        println("The condition is false.")
    }

    val text = if (num1 > 7) "True" else "False"
    println(text)
}