fun main() {
    // Call expression1
    expression1()
    // Call expression2
    expression2()
    // Call expression3
    expression3()
    // Call expression4
    expression4()
    // Call expression5
    expression5()
}

fun expression1() { // Operations
    val exp = 326 / 72 * 15 + 93 % 13

    // checks if answer is equal to 62
    if (exp == 62) {
        println("Math is easy")
    } else {
        println("Math is hard")
    }

    // declares boolean variables
    val haveCat = true
    val haveCatFood = false

    // checks if haveCat and haveCatFood are both true
    if (haveCat && haveCatFood) {
        println("Cat is happy")
    } else {
        println("Oh no!")
    }

    // declares Int variable
    val age = 18

    // checks if age is greater than or equal to 18
    if (age >= 18) println("Can drink alcohol") else println("Illegal to drink  alcohol")
}


fun expression2() { // User Input
    println("Please enter your age")
    // Please enter your age

    val input = readLine()?:"1"

    // converts string to Int
    var age = input.toInt()

    // checks if age is equal to 0
    if (age == 0) age = 1

    // checks if age is between 1 and 12 and stores boolean value to a variable
    val result = if (age in 1..12) "a child"
    else if(age in 13..17) "a teen"
    else "an adult"

    println("Use is $result")
    // Use is a child
}

fun expression3() { // Array List
    // creates empty arraylist
    val animals = arrayListOf<String>()

    // checks if the arraylist animals is empty
    if (animals.isEmpty()) {
        animals.add("dog")
    }

    // prints arraylist
    println(animals)
    // [dog]

    // creates another arraylist
    val animals2 = arrayListOf("cat")

    // adds an element to the arraylist animals2
    if (animals2.add("horse")) {
        println("Horse was successfully added")
    }

    println(animals2)
    // [cat, horse]
}

fun expression4() { // Lists
    // creates a String variable
    val favouritePet = "dog"

    // creates an empty list
    val availablePets = listOf("dog", "cat", "horse")

    // checks if value of favouritePet is in the list of availablePets
    if (favouritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePet is not available")
    }

    println("Enter your preferred coffee")
    // Enter your preferred coffee

    val coffee = readLine()?:""

    // creates a list
    val availableCoffee = listOf("capuccino", "mocha")

    // checks if value of coffee is in the list of availableCoffee
    if (coffee !in availableCoffee) println("Sorry we don't have your coffee")
    else {
        println("$coffee is available")
        println("Please enter a number")
        // Please enter a number

        val input = readLine()?:"0"

        // converts string to Int
        val number = input.toInt()

        // checks if value of number is between 0 and 9
        if (number !in 0..9) println("That's a lot! It will take a while.")
        else println ("Here's your $number cup/s of $coffee! Enjoy <3")
    }
}

fun expression5() { // Sets
    // creates a set
    val guestList = setOf("John", "Alice", "Bob", "Carol")

    println("Please enter your name")
    // Please enter your name

    val guest = readLine()?:""

    // checks if value of guest is in the set guestList
    if (guest in guestList) {
        println("Hi $guest please come in")
    } else {
        println("Sorry you're not on the guest list")
    }

    println("How many cats do you have?")
    // How many cats do you have?

    val input = readLine()?:"0"

    // converts string to Int
    // checks if value of cats is equal to 0
    val howMany = when (input.toInt()) {
        0 -> "no cats"
        in 1..3 -> "few cats"
        in 4..6 -> "several cats"
        else -> "many cats"
    }

    println("This lady has $howMany")

    // creates an arraylist
    val animals = arrayListOf<String>("cat", "dog")

    // checks if the arraylist animals is empty
    if (animals.isEmpty()) {
        println("Thank you for giving homes to all out pets")
    } else {
        println("Please come in and adopt a pet. We have $animals")
    }
}