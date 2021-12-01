fun main() {
    // Call forLoop1
    forLoop1()
    // Call forLoop1
    forLoop2()
    // Call forLoop3
    forLoop3()
    // Call forLoop4
    forLoop4()
    // Call forLoop5
    forLoop5()
    // Call forLoop6
    forLoop6()
}

fun forLoop1() {
    // prints 1-5
    for (item in 1..5) {
        println(item)
    }
}
fun forLoop2() {
    // iterates numbers in reverse order with 2 steps and prints them
    for (item in 5 downTo 1 step 2) {
        println(item)
    }
}

fun forLoop3() {
    // prints 1-3
    for (i in 1 until 4) {
        print(i)
    }
}

fun forLoop4() {
    // creates an array
    val fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

    // iterates the array and prints every element
    for (item in fruits) {
        println(item)
    }
}

fun forLoop5() {
    // creates an array
    val fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

    // iterates the array and prints every element using its index
    for (index in fruits.indices) {
        println(fruits[index])
    }
}

fun forLoop6() {
    // iterates numbers in reverse order with 2 steps and prints them
    for (item in 6 downTo 1 step 2) {
        println(item)
    }
}