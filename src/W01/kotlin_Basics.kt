package W01

fun main() {
    var age: UShort = 22u // Unsigned Integer : age cannot be negative no matter what
    println("My age is $age")
    age = 23u // Unsigned means it can't be negative & there must be an u at the end of the value
    println("My age now is $age")
    //================ char,Unicode and Backslash escape character =================
    val myChar = 'a' // Unicode characters it can be smilie too .... all kind of characters
    val new = '\u00AE'
    println("$myChar $new")

    val name = " Dipu Halder"
    println(name.uppercase()) // uppercase is a function that converts the string to uppercase
    println(name.lowercase())


}