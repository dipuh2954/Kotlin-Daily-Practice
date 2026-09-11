package W01

//    Write fun square(n: Int): Int- returns n?.
fun square(n: Int) = n * n

//    Write fun cube(n: Int) = ... as a single-expression function.
fun cube(n: Int) = n * n * n

//    Write fun max(a: Int, b: Int): Int - returns the larger of the two.
fun max(a: Int, b: Int) = if (a > b) a else b

//    Write fun min(a: Int, b: Int, c: Int): Int - returns the smallest of three numbers.
fun min(a: Int, b: Int, c: Int): Int {
    return if (a <= b && a <= c) {
        a
    } else if (b <= a && b <= c) {
        b
    } else {
        c
    }
}

//    Write fun isLeapYear (year: Int): Boolean — a year is a leap year if divisible by 4, but not 100, unless also divisible by 400.
fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

//    Write fun reverseString(s: String): String - returns the string reversed.
fun reverseString(str: String): String {
    return str.reversed()
}

//    Write fun repeatChar(c: Char, n: Int = 3): String - with a default of 3 repetitions.
fun repeatChar(c: Char, n: Int = 3): String {
    return c.toString().repeat(n)
}

//    Write fun celsiusToFahrenheit (c: Double): Double — formula: (c × 9/5) + 32.
fun celsiusToFahrenheit(c: Double) = ((c * 9) / 5) + 32

//    Write fun gradeToPoints (grade: String): Double - A=10, B=8, C=6, D=5, F=0 using a when expression.
fun gradeToPoints(grade: String): Double {
    when (grade) {
        "A" -> return 10.0
        "B" -> return 8.0
        "C" -> return 6.0
        "D" -> return 5.0
        "F" -> return 0.0
    }
    return 0.0
}

//    Write fun average (vararg nums: Int): Double -accepts any number of integers and returns their average.
fun average(vararg nums: Int): Double {
    var total = 0
    for (num in nums) total += num
    return total.toDouble() / nums.size
}

fun main() {
    print("Enter number for square: ")
    val n1 = readln().toInt()
    println("Square = ${square(n1)}")

    print("Enter number for cube: ")
    val n2 = readln().toInt()
    println("Cube = ${cube(n2)}")

    print("Enter 2 numbers for max: ")
    val a1 = readln().toInt()
    val b1 = readln().toInt()
    println("Max = ${max(a1, b1)}")

    print("Enter 3 numbers for min: ")
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    println("Min = ${min(x, y, z)}")

    print("Enter year: ")
    val year = readln().toInt()
    println("Leap Year = ${isLeapYear(year)}")

    print("Enter string to reverse: ")
    val text = readln()
    println("Reversed = ${reverseString(text)}")

    print("Enter character: ")
    val ch = readln()[0]

    print("Enter repeat count: ")
    val count = readln().toInt()
    println("Repeated = ${repeatChar(ch, count)}")

    print("Enter Celsius: ")
    val temp = readln().toDouble()
    println("Fahrenheit = ${celsiusToFahrenheit(temp)}")

    print("Enter grade (A/B/C/D/F): ")
    val grade = readln()
    println("Points = ${gradeToPoints(grade)}")

    print("How many numbers for average?: ")
    val size = readln().toInt()

    val arr = IntArray(size)

    for (i in 0 until size) {
        print("Enter number ${i + 1}: ")
        arr[i] = readln().toInt()
    }

    println("Average = ${average(*arr.toTypedArray().toIntArray())}")
}