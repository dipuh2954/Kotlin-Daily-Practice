package W02

fun main() {
    //Create a map of 5 countries and their capitals. Print the capital of India and handle the case where a country doesn't exist using getOrDefault().
    val cp = mapOf(
        "India" to "New Delhi",
        "Japan" to "Tokio",
        "France" to "Paris",
        "Brazil" to "Brasilia",
        "Australia" to "Canberra"
    )
    println(cp["India"])
    println(cp.getOrDefault("US", "Doesn't exist"))

//Build a phone book (name → phone number) as a mutable map. Add 3 contacts, update one phone number, remove one contact.
    val contact = mutableMapOf(
        "Berry" to 12342143,
        "Cierra" to 1234364143,
        "Janela" to 12334456143,
        "Franciane" to 123435143,
    )
    contact.remove("Franciane")
    println(contact)
//Given a list of words, count how many times each word appears. Use a mutableMapOf<String, Int>.
    val words = readln().split(" ")
    val counts = mutableMapOf<String, Int>()

    for (word in words) {
        counts[word] = (counts[word] ?: 0) + 1
    }

    counts.forEach { (word, count) ->
        println("$word -> $count")
    }
//Iterate over a student scores map and print only the students who scored above 80.
    // Iterate over a student scores map and print only the students who scored above 80.
    val studentScores = mapOf(
        "Rahul" to 92,
        "Neha" to 76,
        "Aman" to 88,
        "Isha" to 64,
        "Zara" to 81
    )

    studentScores.forEach { (name, score) ->
        if (score > 80) {
            println("$name -> $score")
        }
    }
//Create a list with many duplicates (names of students who showed up across 3 days — same student might repeat). Use a set to find the total unique students.
    val students = listOf(
        "Rahul", "Neha", "Aman", "Isha", "Zara",
        "Rahul", "Neha", "Aman", "Isha", "Zara",
        "Rahul", "Neha", "Aman", "Isha", "Zara"
    )
    val uniqueStudents = students.toSet()
    println("Total unique students: ${uniqueStudents.size}")

//Create two sets of programming languages your two friends know. Find: (a) languages both know, (b) languages only you know, (c) all languages combined.
    val friend1Languages = setOf("Kotlin", "Java", "Python")
    val friend2Languages = setOf("Kotlin", "JavaScript", "Python")

    val bothKnow = friend1Languages.intersect(friend2Languages)
    val onlyFriend1Knows = friend1Languages.subtract(friend2Languages)
    val allLanguages = friend1Languages.union(friend2Languages)

    println("Languages both know: $bothKnow")
    println("Languages only Friend 1 knows: $onlyFriend1Knows")
    println("All languages combined: $allLanguages")
//Build a voting system: receive a list of votes (some people voted twice — invalid). Use a Set to count only unique valid votes.
    val votes = listOf("Alice", "Bob", "Charlie", "Alice", "David", "Bob")
    val uniqueVotes = votes.toSet()
    println("Total valid votes: ${uniqueVotes.size}")
//Given a student list, filter students who scored between 70 and 90 (inclusive).
//Get a list of just the marks of all students who scored above 60, sorted ascending.
//Check: Does any student have a name longer than 6 characters? Do ALL students have marks above 50? Does NONE have marks above 100?
//Count how many students failed (marks < 60). Print the average marks of those who passed.
//Group students by their first letter of name (A-Z groups). Print each group.
//Get the names of the top 2 students in each grade category. (Hint: groupBy then map each group).
//Find the student with the highest marks. Find the student with the lowest marks. Print a congratulations and sorry message respectively.
//Build a "report card" string for each student: "Rahul | 92 | Grade A | PASS". Use map to produce a List<String>, then forEach to print each.
}