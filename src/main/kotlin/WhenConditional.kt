fun main() {
    // Call whenConditional1
    whenConditional1()
    // Call whenConditional2
    whenConditional2()
    // Call whenConditional3
    whenConditional3()
    // Call whenConditional4
    whenConditional4()
    // Call whenConditional5
    whenConditional5()
    // Call whenConditional6
    whenConditional6()
}

fun whenConditional1() {
    // executes the code where the branch condition is satisfied
    val result = when (2) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }

    println(result)
    // Tuesday
}

fun whenConditional2() {
    // declares an Int variable
    // executes the code where the branch condition is satisfied
    when (2) {
        1 -> println("Monday")
        2 -> println("Tuesday") // condition is satisfied
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
}

fun whenConditional3() {
    // declares an Int variable
    // prints "Weekday" if the argument is 1, 2, 3, 4, 5 and "Weekend" if not
    when (2) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }
}

fun whenConditional4() {
    // declares an Int variable
    // prints "Weekday" if the argument is 1 and 5 and "Weekend" if not
    when (2) {
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }
}

fun whenConditional5() {
    // declares Int variables
    val x = 20
    val y = 10
    val z = 10

    // checks if the value of x is equal to the sum of y and z
    when (x) {
        (y+z) -> print("y + z = x = $x")
        else -> print("Condition is not satisfied")
    }
}

fun whenConditional6() {
    // declares an Int variable
    // executes the code where the branch condition is satisfied
    when (2) {
        1 -> {
            println("First day of the week")
            println("Monday")
        }
        2 -> {
            println("Second day of the week")
            println("Tuesday")
        }
        3 -> {
            println("Third day of the week")
            println("Wednesday")
        }
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
}