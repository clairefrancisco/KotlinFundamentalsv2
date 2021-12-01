fun main() {
    // Call forLoop()
    forLoop()
    // Call forEachLoop()
    forEachLoop()
    // Call forEachLoop()
    whileLoop()
}

fun forLoop() {
    for (i in 0..5) {
        print(i)
    }
}

fun forEachLoop() {
    // prints 2-5
    (2..5).forEach {
        println(it)
    }

    // also prints 2-5
    (2..5).forEach {
            i -> println(i)
    }
}

fun whileLoop() {
    // declares counter variable
    var i = 0

    // do while loop, enters the loop at least once before condition is checked
    do {
        i += 5 // i = i + 5
        println("Value of i is $i")  // prints the value of i
    } while(i < 1) // enters the loop until i is greater than 1

    // while loop
    while(i <= 5) { // enters the loop until i is greater than 5
        print(i) // prints the value of i
        i++ // increments i
    }
}