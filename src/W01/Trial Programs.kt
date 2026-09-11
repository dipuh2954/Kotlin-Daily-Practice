package W01

fun main() {
    // Creating an immutable list of strings
    val fruits = listOf("Apple", "Banana", "Mango", "Kiwi")

    // Accessing elements by index (starts at 0)
    println(fruits[0])        // Apple
    println(fruits[2])        // Mango
    println(fruits.first())   // Apple  — same as fruits[0]
    println(fruits.last())    // Kiwi   — last element

    // Safe access — returns null instead of crashing
    println(fruits.getOrNull(10))  // null (no crash!)
    println(fruits.getOrElse(10) { "Unknown" }) // Unknown

    // Common properties and functions
    println(fruits.size)           // 4
    println(fruits.isEmpty())      // false
    println(fruits.isNotEmpty())   // true
    println(fruits.contains("Mango"))  // true
    println("Apple" in fruits)         // true  (same as contains)

    // Iterating
    for (fruit in fruits) {
        println(fruit)
    }

    // With index
    for ((index, fruit) in fruits.withIndex()) {
        println("$index → $fruit")
    }

    // THIS WILL NOT COMPILE — immutable!
    // fruits.add("Orange")   ← compile error
    // fruits[0] = "Peach"    ← compile error
}