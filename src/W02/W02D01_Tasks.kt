package W02

fun main() {
// ================= 🟢List ===============
//    Create an immutable list of 5 country names. Print the second and fourth country using index access.
    val country = listOf("India", "Russia", "China", "japan", "Britain")
    println(country[2])
    println(country[4])
//    Create a mutable shopping list. Add 3 items, remove the middle one, then update the first item's name. Print the final list.
    val shopList = mutableListOf("Shirt", "Jeans", "Trousers", "T-shirt", "Hoodie")
    println(shopList)
    shopList.add("Chinos")
    shopList.add("Shorts")
    shopList.add("Cap")
    println(shopList)
    shopList.removeAt(3)
    shopList[0] = "Socks"
    println(shopList)
//    Given a list of numbers [10, 3, 7, 1, 8, 5], sort it ascending using sort() and print. Then reverse and print again.
    val num = listOf(10, 3, 7, 1, 8, 5)
    println(num.sorted())
//    Use withIndex() to print: "Position 0: Apple", "Position 1: Banana" etc. for a list of fruits.
    val fruits = listOf("Apple", "Banana", "Guava", "Watermelon", "Orange")
    for ((index, fruit) in fruits.withIndex()) {
        println("Position: $index: $fruit")
    }
//    Try accessing index 100 on a list of 3 items using both list[100] (catch the crash) and list.getOrNull(100). Observe the difference.
    println(fruits.getOrNull(100))
    // In first case it gives compileTime error , and in second case it returns null.

}