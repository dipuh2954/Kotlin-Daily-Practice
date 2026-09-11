package W01//🔴 PRIORITY 1 — MUST MASTER  : -- These are the backbone topics.
//
//Q1 — Passed Students (filter)
//    Take 5 marks as input.
//    Print only marks >= 40.
//Q2 — Bonus Marks (map)
//    Take 5 marks.
//    Increase every mark by +5.
//Q3 — Print Everything (forEach)
//    Take 5 names.
//    Print all names using forEach.
//Q4 — First Topper (find)
//    Find first mark > 80.
//Q5 — Any Failed? (any)
//    Check if any mark is below 40.
//Q6 — Everyone Passed? (all)
//    Check whether all marks are >= 40.
//Q7 — Count Passed (count)
//    Count how many students passed.
//Q8 — Total Marks (sum)
//    Calculate total marks.

//🟠 PRIORITY 2 — IMPORTANT TRANSFORMATIONS

//Q9 — Sort Ascending (sortedBy)
//    Sort marks ascending.
//Q10 — Sort Descending (sortedByDescending)
//    Sort marks descending.
//Q11 — Split Pass/Fail (partition)
//    Partition students into:
//    pass
//    fail
//    Print both lists.
//Q12 — No Negative Numbers (none)
//    Check whether none of the numbers are negative.

//🟡 PRIORITY 3 — MAP + GROUPING THINKING

//Q13 — Student Marks Map
//    Create:
//        "Asha" -> 80
//        "Rohan" -> 65
//    Print one student's marks using key access.
//Q14 — Group Names (groupBy)
//    Group names by first letter.
//    Example:
//        A -> [Asha, Aman]
//Q15 — Associate Names with Length (associate)
//    Convert names list into:
//        name -> length

//🟢 PRIORITY 4 — COMBINING + NESTED DATA

//Q16 — Zip Names and Marks (zip)
//    Combine:
//        names
//        marks
//    into pairs.
//Q17 — Flatten Nested List (flatMap)
//    Flatten:
//        [[1,2], [3,4]]
//    into:
//        [1,2,3,4]

//🔵 PRIORITY 5 — LAMBDAS + HIGHER-ORDER FUNCTIONS

//Q18 — Store Lambda
//    Store:
//        { x -> x * x }
//    in variable and call it.
//Q19 — Typed Lambda
//    Create:
//        { x: Int -> x + 10 }
//    Call it.
//Q20 — Create Your Own HOF
//    Make:
//        fun apply(x: Int, op: (Int) -> Int): Int
//        Pass lambda:
//            { it * 2 }
//Q21 — Build Your Own Filter
//    Create simplified version of filter() manually using:
//        loop
//        condition lambda
//        mutableList

//🔥 PRIORITY 6 — USER INPUT PRACTICE

//Q22 — Greeting Program
//    Take name input and print greeting.
//Q23 — Safe Sum
//    Take two safe Int inputs and print sum.
//Q24 — Pass or Fail
//    Take marks input safely and print:
//    Pass
//    Fail
//Q25 — Bigger Number
//    Take two inputs and print bigger number.