fun main() {
    // Call collections1
    collections1()
    // Call collections2
    collections2()
    // Call collections3
    collections3()
    // Call collections4
    collections4()
    // Call collections5
    collections5()
    // Call collections6
    collections6()
}

fun collections1() {
    // creates list
    val numbers = listOf("one", "two", "three", "four")

    // gets the size of the list
    println("Number of elements: ${numbers.size}")

    // gets 4th element whose index is 3
    println("Fourth element: ${numbers[3]}")

    // gets index of element "two"
    println("Index of element \"two\" is ${numbers.indexOf("two")}")
}

fun collections2() {
    // creates mutable list
    val numbers = mutableListOf(1, 2, 3, 4)

    // adds 5 to the list
    numbers.add(5)

    // removes element at index 1
    numbers.removeAt(1)

    // changes value at index 0 to 0
    numbers[0] = 0

    // shuffles list
    numbers.shuffle()

    // prints updated list
    println(numbers)
}

fun collections3() {
    // creates set
    val numbers = setOf(1, 2, 3, 4)

    // gets the size of the set
    println("Number of elements: ${numbers.size}")

    // checks if 1 is in the list
    if (numbers.contains(1)) println("1 is in the set")

    // creates another set
    val numbersBackwards = setOf(4, 3, 2, 1)

    // checks if the sets are equal regardless of order
    println("The sets are equal: ${numbers == numbersBackwards}")
}

fun collections4() {
    // LinkedHashSet is the default implementation
    // creates set
    val numbers = setOf(1, 2, 3, 4)

    // creates another set
    val numbersBackwards = setOf(4, 3, 2, 1)

    // checks if the first elements of numbers and numbersBackwards are the same
    println(numbers.first() == numbersBackwards.first())

    // checks if the first element of numbers is equal to the last element of numberBackwards
    println(numbers.first() == numbersBackwards.last())
}

fun collections5() {
    // creates map
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    // gets the keys
    println("All keys: ${numbersMap.keys}")

    // gets the values
    println("All values: ${numbersMap.values}")

    // gets the value of key2
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")

    // checks if the map contains a value of 1
    if (1 in numbersMap.values) println("The value 1 is in the map")

    // checks if the map contains 1
    if (numbersMap.containsValue(1)) println("The value 1 is in the map")
}

fun collections6() {
    val numbersMap = mutableMapOf("one" to 1, "two" to 2)

    // adds 3 to key three
    numbersMap["three"] = 3

    // changes value of key one to 11
    numbersMap["one"] = 11

    println(numbersMap)
}