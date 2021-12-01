fun main() {
    // Call whileLoop
    whileLoop1()
    // Call whileLoop
    whileLoop2()
}

fun whileLoop1() {
    // declares an Int variable
    var i = 5

    // prints i until it is less than 0
    while (i < 0) {
        println(i)
        // decrements i
        i--
    }
}

fun whileLoop2() {
    // declares an Int variable
    var i = 5

    // prints i until it is below 0
    do {
        println(i)
        // decrements i
        i--
    } while (i > 0)
}