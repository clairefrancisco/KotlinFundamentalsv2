fun main() {
    // Call lambdaFunctions1
    lambdaFunctions1()
    // Call lambdaFunctions2
    lambdaFunctions2()
}

fun lambdaFunctions1() {
    var sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    sum = { x: Int, y: Int -> x + y }
}

fun lambdaFunctions2() {
    val sum = {num1: Int, num2: Int -> num1 + num2}

    println("10+5: ${sum(10,5)}")
    // 10+5: 15
}