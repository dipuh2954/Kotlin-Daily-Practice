package W01

fun main() {
//    Declare a String? variable. Use  ?. to safely print its length. Use ?: to default to 0 if null. Try both with null and a real string.

    var nullableString: String? = null
    println("Length of nullableString: ${nullableString?.length ?: 0}") // Output: Length of nullableString: 0

    nullableString = readlnOrNull()
    println("Length of nullableString: ${nullableString?.length ?: 0}") // Output: Length of nullableString: 14

//    Write a function greetOrDefault(name: String?): String that returns "Hello, {name}!" if name is not null, or "Hello, Stranger!" if null. Use ?:.

    fun greetOrDefault(name: String?): String {
        return "Hello, ${name ?: "Stranger"}!"
    }

    println(greetOrDefault(null)) // Output: Hello, Stranger!
    println(greetOrDefault(readlnOrNull())) // Output: Hello, Alice!

//    Use ?.let to print a user's email in uppercase — but only if the email is not null. Do nothing (silently skip) if null.
    var userEmail: String? = readlnOrNull()
    userEmail?.let { println("User email in uppercase: ${it.uppercase()}") } // Output: User email in uppercase:

//    Write fun safeParseInt(input: String?): Int that uses toIntOrNull() and Elvis to return 0 for any unparseable input.

    fun safeParseInt(input: String?): Int {
        return input?.toIntOrNull() ?: 0
    }

    println(safeParseInt(null)) // Output: 0
    println(safeParseInt("abc")) // Output: 0
    println(safeParseInt("123")) // Output: 123
//    Model a nullable address chain: User? → address: Address? → city: String?. Access the city safely in one line using chained ?. and print "Unknown City" if any part is null.

    data class Address(val city: String?)
    data class User(val address: Address?)

    val user: User? = User(Address("New York"))
    val city = user?.address?.city ?: "Unknown City"
    println("City: $city") // Output: City: New York

    val userWithoutAddress: User? = User(null)
    val city2 = userWithoutAddress?.address?.city ?: "Unknown City"
    println("City: $city2") // Output: City: Unknown City

//    Demonstrate smart cast: declare a String?, check if it's not null with an if, and inside the block use .length and .uppercase() directly without ?..

    val nullableStr: String? = readlnOrNull()
    if (nullableStr != null) {
        println("Length: ${nullableStr.length}") // Smart cast to non-nullable String
        println("Uppercase: ${nullableStr.uppercase()}") // Smart cast to non-nullable String
    } else {
        println("The string is null.")
    }

}