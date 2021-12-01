import kotlin.math.sqrt

fun main() {
    // Call function1
    function1()
    // Call function2
    function2()
    // Call function3
    function3()
}

fun function1() {
    val number = 5.5

    print("Result = ${sqrt(number)}")
    // Result = 2.345207879911715
}

fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    return sum.toInt()
}

fun function2() {
    val number1 = 12.2
    val number2 = 3.4

    // adds two numbers and converts sum to Int
    val result: Int = addNumbers(number1, number2)

    println("result = $result")
    // result = 15
}

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

fun function3() {
    println(getName("John", "Doe"))
    // John Doe
}