package W01

fun main() {
    val userName = "Dipu"
    // userName = "John"  // val doesn't allow to reassign variables meanwhile var is allowed to do so

    var age = 22
    println("$userName is $age years old")
    age = 23
    println("$userName is $age years old Now")


    val number = 23

    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE
    println("Integer Max is $integerMaxValue & Min is $integerMinValue")

    val doubleMaxValue = Double.MAX_VALUE
    val doubleMinValue = Double.MIN_VALUE
    println("Double Max is $doubleMaxValue & Min is $doubleMinValue")

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
    println("Long Max is $longMaxValue & Min is $longMinValue")

    val byteMaxValue = Byte.MAX_VALUE
    val byteMinValue = Byte.MIN_VALUE
    println("Byte Max is $byteMaxValue & Min is $byteMinValue")

    val shortMaxValue = Short.MAX_VALUE
    val shortMinValue = Short.MIN_VALUE
    println("Short Max is $shortMaxValue & Min is $shortMinValue")
}