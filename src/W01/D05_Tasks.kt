package W01

fun main() {
//Use a when expression to convert a month number (1-12) to its name. Use else for invalid numbers.
    val noOfMonth = readln().toIntOrNull() ?: 0
    when (noOfMonth) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid month number...!!")
    }
///Use in ranges in a when to classify a person's age: Child (0-12), Teen (13-17), Adult (18-59), Senior (60+).
    val age = readln().toInt()
    val stage = when (age) {
        in 0..12 -> "Child"
        in 13..17 -> "Teen"
        in 18..59 -> "Adult"
        else -> "Senior"
    }
    println(stage)
//Build a mini calculator: given two numbers and an operator string ("+", "-", "*", "/"), use when to compute and print the result.
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val choice = readln()
    when (choice) {
        "+" -> println("The result of sum is ${num1 + num2}")
        "-" -> println("The result of Subtraction is ${num1 - num2}")
        "*" -> println("The result of Multiplication is ${num1 * num2}")
        "/" -> println("The result of Division is ${num1 / num2}")
        else -> println("Invalid Choices.")
    }
//Use when without an argument to check a temperature and print weather advice: "Wear a jacket", "Great day!", "Stay hydrated", etc.
    val temp = readln().toInt()
    when {
        temp < 15 -> println("Wear a Jacket")
        temp < 30 -> println("Great day!")
        else -> println("Stay hydrated")
    }
}