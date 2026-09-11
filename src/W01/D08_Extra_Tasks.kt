package W01// These are some extra questions on nullSafety

data class Profile(val email: String?)
data class User(val name: String?, val email: String?, val age: Int?, val profile: Profile?)

fun getUser(): User? {
    return User(
        name = "Ava",
        email = "Ava@Example.com",
        age = 22,
        profile = Profile(email = "profile@Example.com")
    )
}

fun main() {
    // 1. Declare a nullable String and print its length using safe call.
    val name: String? = readlnOrNull()
    println(name?.length)

    // 2. Use Elvis operator to print "No Name" if name is null.
    println(name ?: "No Name")

    // 3. Convert: username!!.length -> safe call version.
    val username: String? = readlnOrNull()
    println(username?.length)

    // 4. What is wrong with: val x = name.length if name is String??
    // A String? can hold null. Accessing .length directly can throw NPE.
    // Use name?.length or check for null first.

    // 5. Write an example where !! crashes your program.
    val data: String? = null
    // println(data!!.length) // would throw NullPointerException

    // 6. Use let to print a value only if not null.
    name?.let { println(it) }

    // 7. Use run to lowercase a nullable string.
    val lower = name?.run { lowercase() }
    println(lower)

    // 8. Combine ?. and ?: in one expression.
    val safeLength = name?.length ?: 0
    println(safeLength)

    // 9. What does Int? mean? Write an example.
    // It means the value can be an Int or null.
    val maybeCount: Int? = readlnOrNull()?.toIntOrNull()
    println(maybeCount)

    // 10. Write a nullable Int and safely multiply it by 10.
    val num: Int? = readlnOrNull()?.toIntOrNull()
    val result = num?.times(10)
    println(result)

    // 11. Write a chain like: email?.trim()?.lowercase()
    val userEmail: String? = readlnOrNull()
    val formattedEmail = userEmail?.trim()?.lowercase()
    println(formattedEmail)

    // 12. Convert a nullable list to size using safe calls.
    val list: List<String>? = readlnOrNull()?.split(',')
    val size = list?.size
    println(size)

    // 13. Use let to print the length of a nullable list.
    list?.let { println("List size: ${it.size}") }

    // 14. Use run to operate on a nullable user object with multiple fields.
    val userFromInput: User? = getUser()
    userFromInput?.run {
        println("Name: $name")
        println("Email: $email")
        println("Age: $age")
    }

    // 15. Rewrite an unsafe expression to a fully null-safe one.
    // val unsafeLength = name!!.length // Unsafe
    val safeLen = name?.length ?: 0
    println(safeLen)

    // 16. Show a case where let is better than if (x != null).
    val emailInput: String? = readlnOrNull()
    emailInput?.let { println("Email: $it") } ?: println("No email provided")

    // 17. Show a case where run is cleaner than let.
    val userFromApi: User? = getUser()
    userFromApi?.run {
        println("Name: $name")
        println("Email: $email")
        println("Age: $age")
    }

    // 18. What does Elvis operator prevent in Android apps?
    """It prevents NullPointerException by providing a default value
        |when an expression evaluates to null,
        |ensuring that the app doesn't crash
        |due to unexpected null values.""".trimMargin()

    // 19. Explain why !! is almost always a bad choice.
    """The !! operator forces a nullable type to be treated as non-nullable,
        |which can lead to NullPointerExceptions if the value is actually null.
        |It bypasses Kotlin's null safety features, making the code less safe and more prone to crashes.""".trimMargin()

    // 20. Safely access a nullable nested property (user?.profile?.email).
    val userFinal: User? = getUser()
    val profileEmail = userFinal?.profile?.email
    println(profileEmail)
}