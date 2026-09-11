package W01

import kotlin.random.Random

fun main() {
//Print a multiplication table for any number from 1 to 12 (e.g., 7x1=7, 7x2=44...).
    print("Enter the number for desired table: ")
    val num1 = readln().toIntOrNull() ?: 0

    println("Multiplication table for $num1: ")
    for (i in 1..10) {
        println("$num1 x $i = ${num1 * i}")
    }
//FizzBuzz: for 1 to 30, print "Fizz" for multiples of 3, "Buzz" for multiples of 5, "FizzBuzz" for both, otherwise the number.
    print("Enter the maximum number until you want to check: ")
    val rang = readln().toIntOrNull() ?: 10
    for (i in 1..rang) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
//Sum of digits: given the number 98765, extract and sum all its digits using a while loop.
    print("Enter the  number to sum: ")
    val num2 = readln().toIntOrNull() ?: 3

    var sum = 0
    var temp = num2
    while (temp > 0) {
        sum += temp % 10
        temp /= 10
    }
    println("Sum of the digits of the number $num2 = $sum")
//Print a right-angle triangle pattern using nested for loops (5 rows, row i has i stars).
    print("Enter the symbol to use : ")
    val symbol = readln()
    print("Enter number of rows: ")
    val num3 = readln().toIntOrNull() ?: 4
    for (i in 1..num3) {
        for (j in 1..i) {
            print("$symbol ")
        }
        println()
    }
//Find all prime numbers from 2 to 50 using a for loop inside a for loop (or any approach).
    println("Prime numbers between 2 and 50 are:")

    // Outer loop to iterate from 2 to 50
    for (num in 2..50) {
        var isPrime = true

        // Inner loop to check if 'num' has any divisors other than 1 and itself
        // Optimization: only check up to num / 2
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break // Exit inner loop if a divisor is found
            }
        }

        // If no divisors were found, the number is prime
        if (isPrime) {
            print("$num ")
        }
    }
//Use repeat () to simulate rolling a dice 10 times and printing the result each time (use Random. nextInt (1,7)).
    repeat(10) {
        val roll = Random.nextInt(1, 7)
        println("Roll: $roll")
    }
}